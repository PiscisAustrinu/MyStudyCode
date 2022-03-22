package com.Ylb.MyBatis.mapper;

import com.Ylb.MyBatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author：Yang Lingbo
 * Date:2022/3/19 15:15
 * Description:
 */
public interface SqlMapper {
    /**
     *  根据用户名进行模糊查询
     */
    List<User> getUserLike(@Param("username")String username);
    /**
     * 批量删除
     */
    Integer deleteMore(@Param("ids")String ids);
    /**
     * 查询某个表中的所有数据
     */
    List<User> getUserByTableName(@Param("tableName")String tableName);

    /**
     * 添加用户
     */
    void insertUser(User user);
}
