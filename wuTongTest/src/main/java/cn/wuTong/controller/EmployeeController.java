package cn.wuTong.controller;

import cn.wuTong.domain.Employee;
import cn.wuTong.exception.SysException;
import cn.wuTong.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @Author 赖国财
 * @Date 2020/9/7 20:32
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询所有的数据
     * @return
     */
    @RequestMapping("/findAll.do")
    public String findAll(Model model)throws SysException{
//        try {
//            //模拟异常
//            int i = 1/0;
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new SysException("出错啦...");
//        }
        List<Employee> list = employeeService.findAll();
        for (Employee employee : list) {
            System.out.println(employee);
        }
        model.addAttribute("list",list);
        return "list";
    }

    /**
     * 添加
     * @param employee
     * @return
     */
    @RequestMapping("/save.do")
    public String save(Employee employee){
        employeeService.save(employee);
        return "redirect:findAll.do";
    }

    /**
     * 删除
     * @param employeeId
     * @return
     */
    @RequestMapping("/delete.do")
    public String delete(@RequestParam(name = "id", required = true) String employeeId) {
        employeeService.delete(employeeId);
        return "redirect:findAll.do";
    }

    /**
     * 查询一个的数据
     * @return
     */
    @RequestMapping("/findById.do")
    public String findById(Model model,@RequestParam(name = "id", required = true) String employeeId) {
        Employee employee = employeeService.findById(employeeId);
        System.out.println(employee);
        model.addAttribute("employee",employee);
        return "update";
    }

    /**
     * 更新
     * @param employee
     * @return
     */
    @RequestMapping("/update.do")
    public String update(Employee employee){
        employeeService.update(employee);
        return "redirect:findAll.do";
    }

    /**
     * 短信验证
     * @param phone
     * @return
     */
    @RequestMapping("/sms1.do")
    public ModelAndView getSMSCode1(@RequestParam(name = "phone" , required = true) String phone, HttpServletRequest request)throws Exception{
        HashMap<String, String> map = employeeService.sendMsg(phone);
        ModelAndView model = new ModelAndView();
        String result = map.get("result");   //获取到result值
        if (result.trim().equals("1")) {
            String code = map.get("code");
            HttpSession session = request.getSession(); //设置session
            session.setAttribute("code",code);    //将短信验证码放到session中保存
            session.setMaxInactiveInterval(60 * 3); //缓存设置3分钟
            model.addObject("flag", "短信发送成功");
        }else{
            model.addObject("flag", "短信发送失败,请重试");
        }
        model.addObject("phone",phone);
        model.setViewName("login.jsp");
        return model;
    }
    /**
     * 短信验证
     * @param checkNum
     * @return
     */
    @RequestMapping("/sms.do")
    public ModelAndView getSMSCode(@RequestParam(name = "checkNum" , required=false)String checkNum,HttpServletRequest request)throws Exception{
        //从session中比对发送的验证码
        HttpSession  session = request.getSession();//设置session
        String sessioncode =(String) session.getAttribute("code");
        System.out.println(sessioncode);
        ModelAndView model = new ModelAndView();
        if((checkNum).equals(sessioncode)){//比对缓存
            model.setViewName("index.jsp");
        }else {
            model.addObject("flag", "验证码错误,请重试");
            model.setViewName("login.jsp");
        }
        return model;
    }
}
