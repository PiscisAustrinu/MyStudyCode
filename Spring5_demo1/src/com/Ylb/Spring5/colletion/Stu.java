package com.Ylb.Spring5.colletion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] name;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private List<Course> courseList;

    public Stu(String[] name, List<String> list, Map<String, String> map, Set<String> set,List<Course> courseList) {
        this.name = name;
        this.list = list;
        this.map = map;
        this.set = set;
        this.courseList = courseList;
    }

    public void testCollection(){
        System.out.println(Arrays.toString(name));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
        System.out.println(courseList);
    }
}
