package com.Ylb.mybatis.test;

import com.Ylb.mybatis.bean.Emp;
import com.Ylb.mybatis.bean.EmpExample;
import com.Ylb.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Author：Yang Lingbo
 * Date:2022/3/22 16:18
 * Description:
 */
public class MBGTest {
    @Test
    public void testMBG(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(stream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//            查询所有数据
            /*List<Emp> emps = mapper.selectByExample(null);
            emps.forEach(emp -> System.out.println(emp));
             */
//            根据条件查询
            EmpExample empExample = new EmpExample();
            empExample.createCriteria().andEmpNameEqualTo("杨凌波").andAgeBetween(10,30);
            empExample.or().andDidIsNotNull();
            List<Emp> emps = mapper.selectByExample(empExample);
            emps.forEach(emp -> System.out.println(emp));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
