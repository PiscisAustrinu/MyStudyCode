package com.Ylb.MyBatis.mapper;

import com.Ylb.MyBatis.pojo.User;

import java.util.List;

/**
 * Author：Yang Lingbo
 * Date:2022/3/17 16:25
 * Description:
 */
public interface UserMapper {
    /**
     * MyBatis面向接口编程的两个一致
     * 1、映射文件的namespace要和mapper接口的全类名保持一致
     * 2、映射文件中SQL语句的id要和mapper接口中的方法名一致
     */

    /**
     * 添加用户信息
     */
    int insertUser();
    /**
     * 修改用户信息
     */
    void updateUser();
    /**
     * 删除用户
     */
    void deleteUser();
    /**
     * 根据id查询用户
     */
    User getUser();
    /**
     * 查询所有用户
     */
    List<User> getAllUser();
}
