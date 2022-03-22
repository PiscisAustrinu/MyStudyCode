package com.Ylb.MyBatis.mapper;

import com.Ylb.MyBatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Author：Yang Lingbo
 * Date:2022/3/19 14:09
 * Description:
 */
public interface SelectMapper {
    /**
     * 根据id查询用户
     */
    User getUserById(@Param("id") Integer id);
    /**
     * 查询所有用户
     */
    List<User> getAllUser();
    /**
     * 查询总记录数
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String,Object> getUserToMap(@Param("id")Integer id);

    /**
     * 查询所有用户信息为map集合
     */
//    List<Map<String,Object>> getAllUserToMap();
    @MapKey("id")
    Map<String,Object> getAllUserToMap();
}
