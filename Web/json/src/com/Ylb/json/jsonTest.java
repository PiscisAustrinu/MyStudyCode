package com.Ylb.json;

import com.Ylb.pojo.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jsonTest {
//    1、javaBean和json的互换
    @Test
    public void test1(){
        Person person = new Person(1,"杨凌波");
//        创建Gson对象实例
        Gson gson = new Gson();
//        toJSON方法可以把java对象转换为json字符串
        String personJsonString = gson.toJson(person);
        System.out.println(personJsonString);
//        fromJson把json字符串转换回java对象
//        第一个参数是json字符串
//        第二个参数是转换回去的java对象
        Person person1 = gson.fromJson(personJsonString, Person.class);
        System.out.println(person1);
    }
//    2、Lst和json的互换
    @Test
    public void test2(){
        List<Person> personList  =new ArrayList<>();
        personList.add(new Person(1,"杨凌波"));
        personList.add(new Person(2,"韦炎"));
        Gson gson = new Gson();
//        把list集合转换为JSON字符串
        String personListJSONString = gson.toJson(personList);
        System.out.println(personListJSONString);
        List<Person> list = gson.fromJson(personListJSONString,new PersonListTYpe().getType());
        System.out.println(list);
        Person person = list.get(0);
        System.out.println(person);
    }
//    3、map和json的互换
    @Test
    public void test3(){
        Map<Integer,Person> personMap = new HashMap<>();

        personMap.put(1,new Person(1,"杨凌波"));
        personMap.put(2,new Person(2,"韦炎"));

        Gson gson = new Gson();

        String personMapJsonString = gson.toJson(personMap);
        System.out.println(personMapJsonString);

        Map<Integer,Person> personMap1 = gson.fromJson(personMapJsonString, new TypeToken<HashMap<Integer,Person>>(){}.getType());
        System.out.println(personMap1);

        Person person = personMap1.get(1);
        System.out.println(person);
    }
}
