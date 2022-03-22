package com.Ylb.MyBatis.test;

import com.Ylb.MyBatis.mapper.SelectMapper;
import com.Ylb.MyBatis.pojo.User;
import com.Ylb.MyBatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

/**
 * Author：Yang Lingbo
 * Date:2022/3/19 14:10
 * Description:
 */
public class SelectTest {
    /**
     * MyBatis的各种查询功能：
     * 1、若查询出的数据只有一条
     * a>可以通过实体类对象接收
     * b>可以通过list集合接收
     * c>可以通过map集合接收
     * 结果：{password=520106, sex=男, eamil=2862450172@qq.com, id=3, age=21, username=杨凌波}
     * 2、若查询出的数据有多条
     * a>可以通过list集合接收
     * b>可以通过map类型的list集合接收
     * c>可以在mapper接口的方法上添加@MapKey注解，此时就可以将每条数据转换的map集合作为值，以某个字段作为键
     * 注意：一定不能通过实体类对象接收，此时会抛出异常TooManyResultsException
     *
     * MyBatis中设置了默认的类型别名
     * java.lang.Integer-->int,integer
     * int-->_int,_integer
     * Map-->map
     * String-->string
     */




    /**
     * 根据id查询用户
     */
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        User user = selectMapper.getUserById(4);
        System.out.println(user);
    }
    /**
     * 查询所有用户
     */
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        List<User> allUser = selectMapper.getAllUser();
        allUser.forEach(user -> System.out.println(user));
    }
    /**
     * 查询总记录数
     */
    @Test
    public void testCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(selectMapper.getCount());
    }
    /**
     * 根据id查询用户信息为map集合
     */
    @Test
    public void testGetUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = selectMapper.getUserToMap(3);
        System.out.println(map);
    }

    /**
     * 查询所有用户信息为map集合
     */
    @Test
    public void testGetAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper selectMapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> user = selectMapper.getAllUserToMap();
        System.out.println(user);
    }
}
