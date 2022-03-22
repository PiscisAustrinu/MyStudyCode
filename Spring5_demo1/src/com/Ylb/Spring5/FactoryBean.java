package com.Ylb.Spring5;

import com.Ylb.Spring5.colletion.Course;

public class FactoryBean implements org.springframework.beans.factory.FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course("王小布");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return org.springframework.beans.factory.FactoryBean.super.isSingleton();
    }
}
