package cn.wuTong.service.impl;

import cn.wuTong.dao.EmployeeDao;
import cn.wuTong.domain.Employee;
import cn.wuTong.service.EmployeeService;
import cn.wuTong.util.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author 赖国财
 * @Date 2020/9/7 20:30
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    /**
     * 添加
     * @param employee
     */
    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    /**
     * 删除
     * @param employeeId
     */
    @Override
    public void delete(String employeeId) {
        employeeDao.delete(employeeId);
    }

    /**
     * 查询一个
     * @param employeeId
     * @return
     */
    @Override
    public Employee findById(String employeeId) {
        return employeeDao.findById(employeeId);
    }

    /**
     * 更新
     * @param employee
     */
    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    /**
     * 发送短信
     * @param phone
     * @return
     * @throws Exception
     */
    @Override
    public HashMap<String, String> sendMsg(String phone)throws Exception {
        return SendMessage.getMessageStatus(phone);
    }
}
