package com.Ylb.mybatis.test;

import com.Ylb.mybatis.bean.Emp;
import com.Ylb.mybatis.mapper.EmpMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
 * Date:2022/3/22 17:55
 * Description:
 */
public class PageHelperTest {
    /**
     * limit index,pageSize
     * index:当前页的起始索引
     * pageSize：每页显示的条数
     * pageNum：当前页的页码
     * index=(pageNum-1)*pageSize
     *
     * 使用MyBatis的分页插件实现分页功能
     * 1、需要在查询功能之前开启分页
     * PageHelper.startPage(int pageNum,int pageSize);
     * 2、在查询功能之后获取分页相关信息
     * PageInfo<emp> page = new pageInfo<>(list 5);
     * list表示分页数据
     * 5表示当前导航分页的数量
     */
    @Test
    public void testPageHelper(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(stream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            PageHelper.startPage(4,2);
            List<Emp> list = mapper.selectByExample(null);
            PageInfo<Emp> pageInfo = new PageInfo<>(list,5);
            System.out.println(pageInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
