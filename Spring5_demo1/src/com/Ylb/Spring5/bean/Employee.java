package com.Ylb.Spring5.bean;

public class Employee {
    private String name;
    private int id;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Employee(String name, int id, Dept dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public void testEmployee(){
        System.out.println("姓名："+name+"\n工号："+id+"\n部门："+dept);
    }

}
