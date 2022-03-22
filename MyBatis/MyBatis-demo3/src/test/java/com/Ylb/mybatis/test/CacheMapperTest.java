package com.Ylb.mybatis.test;

import com.Ylb.mybatis.mapper.CacheMapper;
import com.Ylb.mybatis.pojo.Emp;
import com.Ylb.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Author：Yang Lingbo
 * Date:2022/3/21 14:13
 * Description:
 */
public class CacheMapperTest {
    /**
     * 测试一级缓存
     */
    @Test
    public void testGetEmpById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(1);
        System.out.println(emp1);
//        mapper1.deleteEmp(8);
        sqlSession.clearCache();
        CacheMapper mapper2 = sqlSession.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpById(1);
        System.out.println(emp2);
    }

    /**
     * 测试二级缓存
     */
    @Test
    public void testTwoCache(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(stream);
            SqlSession sqlSession1 = sessionFactory.openSession();
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            Emp emp1 = mapper1.getEmpById(1);
            System.out.println(emp1);
            sqlSession1.close();
            SqlSession sqlSession2 = sessionFactory.openSession();
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            Emp emp2 = mapper2.getEmpById(1);
            System.out.println(emp2);
            sqlSession2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
