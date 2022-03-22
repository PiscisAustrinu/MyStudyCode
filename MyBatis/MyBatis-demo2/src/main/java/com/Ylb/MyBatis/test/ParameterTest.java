package com.Ylb.MyBatis.test;

import com.Ylb.MyBatis.mapper.ParamMapper;
import com.Ylb.MyBatis.pojo.User;
import com.Ylb.MyBatis.utils.SqlSessionUtils;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.DatabaseMetaData;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author：Yang Lingbo
 * Date:2022/3/18 19:16
 * Description:
 */
public class ParameterTest {
    /**
     * MyBatis获取参数值的两种方式：${}和#{}
     * ${}本质字符串拼接
     * #{}本质占位符赋值
     * MyBatis获取参数值的各种情况
     * 1、mapper接口方法的参数为单个的字面量类型
     * 可以通过${}和#{}以任意的名称获取参数值，但是需要注意${}的单引号问题
     * 2、mapper接口方法的参数为多个时
     * 此时MyBatis会将这些参数放在一个map集合中，以两种方式进行存储
     * a>以arg0、arg1...为键，以参数为值
     * b>以param1、param2...为键、以参数为值
     * 因此只需要通过#{}和${}以键的方式访问值即可，但是需要注意${}的单引号问题
     * 3、若mapper接口方法的参数有多个时，可以手动将这些参数放在一个map中存储
     * 只需要通过#{}和${}以键的方式访问值即可，但是需要注意${}的单引号问题
     * 4、mapper接口方法的参数时实体类类型的参数
     * 只需要通过#{}和${}以属性的方式访问属性值即可，但是需要注意${}的单引号问题
     * 5、使用@Param注解命名参数
     * 此时MyBatis会将这些参数放在一个map集合中，以两种方式进行存储
     * a>以@Param注解的值为键，以参数为值
     * b>以param1，param2...为键，以参数为值
     * 只需要通过#{}和${}以键的方式访问值即可，但是需要注意${}的单引号问题
     */
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParamMapper paramMapper = sqlSession.getMapper(ParamMapper.class);
        User user = paramMapper.getUserByUsername("杨凌波");
        System.out.println(user);
    }
    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParamMapper paramMapper = sqlSession.getMapper(ParamMapper.class);
        User user = paramMapper.checkLogin("杨凌波", "520106");
        System.out.println(user);
    }
    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParamMapper paramMapper = sqlSession.getMapper(ParamMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("username","杨凌波");
        map.put("password","520106");
        User user = paramMapper.checkLoginByMap(map);
        System.out.println(user);
    }
    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParamMapper paramMapper = sqlSession.getMapper(ParamMapper.class);
        int i = paramMapper.insertUser(new User(null, "韦炎", "520227", 23, '女', "19990088@qq.com"));
        System.out.println(i);
    }
    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParamMapper paramMapper = sqlSession.getMapper(ParamMapper.class);
        User 韦炎 = paramMapper.checkLoginByParam("韦炎", "520227");
        System.out.println(韦炎);
    }
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParamMapper paramMapper = sqlSession.getMapper(ParamMapper.class);
        List<User> user = paramMapper.getAllUser();
        user.forEach(user1 -> System.out.println(user1));
    }

    @Test
    public void testJDBC() throws Exception {
        String username = "杨凌波";
        Class.forName("");
        Connection connection = (Connection) DriverManager.getConnection("","","");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user where username = ?");
        preparedStatement.setString(1,username);
    }

}
