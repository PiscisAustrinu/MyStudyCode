package com.Ylb.mybatis.mapper;

import com.Ylb.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * Author：Yang Lingbo
 * Date:2022/3/20 9:19
 * Description:
 */
public interface DeptMapper {
    /**
     * 分布查询员工信息和单位信息
     * 第二步：根据部门id查询部门信息
     */
    Dept getEmpAndDeptByStepTwo(@Param("did")int did);

    /**
     * 查询部门及部门中所含的员工信息
     */
    Dept getDeptAndEmp(@Param("did") int did);


    /**
     * 分步查询部门信息及其所含的员工信息
     * 第一步：查询部门信息
     */
    Dept getDeptAndEmpByStepOne(@Param("did") int did);
}
