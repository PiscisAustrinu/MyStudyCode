package com.Ylb.mybatis.mapper;

import com.Ylb.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author：Yang Lingbo
 * Date:2022/3/21 9:18
 * Description:
 */
public interface DynamicSQLMapper {
    /**
     * 动态SQL
     * 多条件查询
     */
    List<Emp> getEmpByConditions(Emp emp);
    /**
     * 测试choose、when、otherwise
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 使用数组和<forEach></forEach>批量删除员工
     */
    Integer DeleteMore(@Param("eids") Integer[] eids);

    /**
     * 使用List和<forEach></forEach>批量添加员工
     */
    Integer insertMoreByList(@Param("emps") List<Emp> emps);
}
