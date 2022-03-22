package com.Ylb.mybatis.pojo;

import java.io.Serializable;

/**
 * Author：Yang Lingbo
 * Date:2022/3/20 9:11
 * Description:
 */
public class Emp implements Serializable {
    private Integer eid;
    private String EmpName;
    private Integer age;
    private Character sex;
    private String email;
    private Dept dept;



    public Emp(Integer eid, String empName, Integer age, Character sex, String email) {
        this.eid = eid;
        this.EmpName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        this.EmpName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", EmpName='" + EmpName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", dept=" + dept +
                '}';
    }
}
