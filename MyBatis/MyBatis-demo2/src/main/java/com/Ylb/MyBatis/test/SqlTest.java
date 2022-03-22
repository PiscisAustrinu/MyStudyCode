package com.Ylb.MyBatis.test;

import com.Ylb.MyBatis.mapper.SqlMapper;
import com.Ylb.MyBatis.pojo.User;
import com.Ylb.MyBatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Author：Yang Lingbo
 * Date:2022/3/19 15:18
 * Description:
 */
public class SqlTest {
    @Test
    public void testGetUserLike(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
        List<User> users = sqlMapper.getUserLike("凌");
        System.out.println(users);
    }
    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
        Integer result = sqlMapper.deleteMore("1,2,3");
        System.out.println(result);
    }
    @Test
    public void testGetUserByTableName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        List<User> user = mapper.getUserByTableName("user");
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
        User user = new User(null,"杨凌波","20010211",21,'男',"19999162@qq.com");
        sqlMapper.insertUser(user);
        System.out.println(user);
    }
}
