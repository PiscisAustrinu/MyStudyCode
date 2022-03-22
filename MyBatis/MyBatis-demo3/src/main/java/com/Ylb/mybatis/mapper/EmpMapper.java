package com.Ylb.mybatis.mapper;

import com.Ylb.mybatis.pojo.Dept;
import com.Ylb.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author：Yang Lingbo
 * Date:2022/3/20 9:13
 * Description:
 */
public interface EmpMapper {
    /**
     * 查询所有Emp
     */
    List<Emp> getAllEmp();

    /**
     * 查询员工及其所对应的部门信息
     */
    Emp getEmpAndDept(@Param("eid") int eid);

    /**
     * 分步查询员工信息和部门信息
     */
    Emp getEmpAndDeptByStepOne(@Param("eid") int id);

    /**
     * 分步查询部门信息及其所含的员工信息
     * 第二步：根据部门id查询员工信息
     */
    List<Dept> getDeptAndEmpByStepTwo(@Param("did") int did);
}
