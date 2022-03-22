package com.Ylb.mvc.Controller;

import com.Ylb.mvc.bean.Employee;
import com.Ylb.mvc.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Author：Yang Lingbo
 * Date:2022/3/9 19:50
 * Description:
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    //查询员工信息
    @GetMapping("/employee")
    public String getEmployee(Model model){
        Collection<Employee> employees = employeeDao.getALl();
        model.addAttribute("employees",employees);
        return "employee_list";
    }
//    根据id删除员工
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";
    }

//    添加员工
    @PostMapping("/employee")
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

//    更新员工
    @GetMapping("/employee/{id}")
    public String getEmployeeById(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute(employee);
        return "/updateEmployee";
    }

//    执行更新
    @PutMapping("/employee")
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

}
