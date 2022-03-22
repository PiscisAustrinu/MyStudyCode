package com.Ylb.mybatis.test;

import com.Ylb.mybatis.mapper.DynamicSQLMapper;
import com.Ylb.mybatis.pojo.Emp;
import com.Ylb.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Author：Yang Lingbo
 * Date:2022/3/21 9:24
 * Description:
 */
public class DynamicSQLMapperTest {
    /**
     * 动态SQL：
     * 1、if：根据标签中test属性所对应的表达式决定标签中的内容是否需要拼接到SQL中
     * 2、where：
     * 当where标签中有内容时，会自动生成where关键字，并且将内容前多余的and或or去掉
     * 当where标签中没有内容时，此时where标签没有任何效果
     * 注意：where标签不能将其中内容后面多余的and或or去掉
     * 3、trim：
     * 若标签中有内容时：
     * prefix|suffix：将trim标签中内容前面或后面添加指定内容
     * suffixOverrides|prefixOverrides：将trim标签中内容前面或后面去掉指定内容
     * 4、choose、when、otherwise  相当于if...else if...else...
     * when至少要有一个，otherwise最多只能有一个
     * 5、foreach
     * collection：设置需要循环的数组或集合
     * items：表示数组或集合中的每一个数据
     * separator：循环体之间的分隔符
     * open：foreach标签所循环的所有内容的开始符
     * close：foreach标签所循环的所有内容的结束符
     * 6、sql标签
     * 设置SQL片段：<sql id = "empColumns>eid,emp_name,age,sex,email</sql>
     * 引用SQL片段：<include refid="empColumns"></include>
     */
    @Test
    public void testGetEmpByConditions(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByConditions = dynamicSQLMapper.getEmpByConditions(new Emp(null, "杨凌波", 21, '男', null));
        System.out.println(empByConditions);
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper dynamicSQLMapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByChoose = dynamicSQLMapper.getEmpByChoose(new Emp(null, null, null, null, null));
        System.out.println(empByChoose);
    }

    @Test
    public void testDeleteMore(){
        DynamicSQLMapper dynamicSQLMapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQLMapper.class);
        Integer integer = dynamicSQLMapper.DeleteMore(new Integer[]{6, 7});
        System.out.println(integer);
    }

    @Test
    public void testInsertMoreByList(){
        DynamicSQLMapper dynamicSQLMapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"a1",22,'男',"123@163.com");
        Emp emp1 = new Emp(null,"a2",22,'男',"123@163.com");
        List<Emp> emps = Arrays.asList(emp, emp1);
        Integer integer = dynamicSQLMapper.insertMoreByList(emps);
        System.out.println(integer);
    }
}
