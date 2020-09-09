package cn.wuTong.dao;

import cn.wuTong.domain.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 赖国财
 * @Date 2020/9/7 20:28
 */
@Repository
public interface EmployeeDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from Employee")
    public List<Employee> findAll();

    /**
     * 添加
     * @param employee
     */
    @Insert("insert into employee(name,age,sex,address,phone,password) values(#{name},#{age},#{sex},#{address},#{phone},#{password})")
    void save(Employee employee);

    /**
     * 删除
     * @param employeeId
     */
    @Delete("delete from employee where id=#{employeeId}")
    void delete(String employeeId);

    /**
     * 查找一个
     * @param employeeId
     * @return
     */
    @Select("select * from Employee where id = #{employeeId}")
    Employee findById(String employeeId);

    /**
     * 更新
     * @param employee
     */
    @Update("update employee set name = #{name},age = #{age},sex = #{sex},address = #{address},phone = #{phone},password = #{password} where id = #{id}")
    void update(Employee employee);
}
