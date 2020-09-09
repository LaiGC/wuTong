package cn.wuTong.service;

import cn.wuTong.domain.Employee;

import java.util.HashMap;
import java.util.List;

/**
 * @Author 赖国财
 * @Date 2020/9/7 20:29
 */
public interface EmployeeService {

    /**
     * 查询所有
     * @return
     */
    public List<Employee> findAll();

    /**
     * 添加
     * @param employee
     */
    void save(Employee employee);

    /**
     * 删除
     * @param employeeId
     */
    void delete(String employeeId);

    /**
     * 查询一个
     * @param employeeId
     * @return
     */
    Employee findById(String employeeId);

    /**
     * 更新
     * @param employee
     */
    void update(Employee employee);

    /**
     * 发送验证码
     * @param phone
     * @return
     */
    HashMap<String,String> sendMsg(String phone) throws Exception;
}
