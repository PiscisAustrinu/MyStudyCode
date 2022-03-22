package com.Ylb.mvc.dao;

import com.Ylb.mvc.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Author：Yang Lingbo
 * Date:2022/3/9 20:04
 * Description:
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employeeMap = null;
    static {
        employeeMap = new HashMap<Integer,Employee>();
        employeeMap.put(1001,new Employee(1001,"E-AA","aa@163.com",1));
        employeeMap.put(1002,new Employee(1002,"E-BB","bb@163.com",1));
        employeeMap.put(1003,new Employee(1003,"E-CC","cc@163.com",0));
        employeeMap.put(1004,new Employee(1004,"E-DD","dd@163.com",0));
        employeeMap.put(1005,new Employee(1005,"E-EE","ee@163.com",1));
    }
    private static Integer initID = 1006;
    public void save(Employee employee){
        if (employee.getId()==null){
            employee.setId(initID++);
        }
        employeeMap.put(employee.getId(),employee);
    }
    public Collection<Employee> getALl(){
        return employeeMap.values();
    }
    public Employee get(Integer id){
        return employeeMap.get(id);
    }

    public void delete(Integer id){
        employeeMap.remove(id);
    }
}
