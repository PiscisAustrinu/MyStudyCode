package com.Ylb.mybatis.mapper;

import com.Ylb.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * Author：Yang Lingbo
 * Date:2022/3/21 14:11
 * Description:
 */
public interface CacheMapper {
    /**
     * 测试一级缓存
     */
    Emp getEmpById(@Param("eid") Integer eid);

    /**
     * 在两次查询之间执行增删改操作
     */
    int deleteEmp(@Param("eid") int eid);
}
