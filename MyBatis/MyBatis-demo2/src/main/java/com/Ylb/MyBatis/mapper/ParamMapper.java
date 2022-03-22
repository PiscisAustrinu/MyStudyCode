package com.Ylb.MyBatis.mapper;

import com.Ylb.MyBatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Author：Yang Lingbo
 * Date:2022/3/18 19:06
 * Description:
 */
public interface ParamMapper {
    /**
     * 查询所有用户
     */
    List<User> getAllUser();
    /**
     * 根据用户名查询用户
     */
    User getUserByUsername(String username);
    /**
     * checkLogin
     */
    User checkLogin(String username,String password);
    /**
     * checkLoginByMap
     */
    User checkLoginByMap(Map<String,Object> map);
    /**
     * 添加用户
     */
    int insertUser(User user);
    /**
     * checkLoginByParam（@Param）
     */
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);
}
