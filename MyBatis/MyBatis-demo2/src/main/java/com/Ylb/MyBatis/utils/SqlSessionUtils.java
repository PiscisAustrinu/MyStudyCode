package com.Ylb.MyBatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Author：Yang Lingbo
 * Date:2022/3/18 19:12
 * Description:
 */
public class SqlSessionUtils {
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            sqlSession = sessionFactory.openSession(true);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
}
