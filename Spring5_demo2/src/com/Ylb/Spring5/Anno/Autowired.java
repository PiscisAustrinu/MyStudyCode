package com.Ylb.Spring5.Anno;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

@Component
public class Autowired {
//    使用在属性定义上
    @org.springframework.beans.factory.annotation.Autowired
    private Anno anno;

    @org.springframework.beans.factory.annotation.Autowired
//    自动装载注解使用在构造器中
    public Autowired(Anno anno) {
        this.anno = anno;
    }

    @org.springframework.beans.factory.annotation.Autowired
//    在属性的Setter方法中使用
    public void setAnno(Anno anno) {
        this.anno = anno;
    }

    @org.springframework.beans.factory.annotation.Autowired
//    在一般方法中使用
    public void myInitAnno(Anno anno){
        this.anno = anno;
    }

    @org.springframework.beans.factory.annotation.Autowired         //自动装载数组类型的依赖
    private Anno[] annos;

    @org.springframework.beans.factory.annotation.Autowired         //自动装载集合类型的依赖
    private Set<Anno> annoSet;

    @org.springframework.beans.factory.annotation.Autowired         //自动装载键值对类型的依赖
    private Map<String,Anno> annoMap;
    @org.springframework.beans.factory.annotation.Autowired
    public void setAnnos(Anno[] annos) {
        this.annos = annos;
    }
    @org.springframework.beans.factory.annotation.Autowired
    public void setAnnoSet(Set<Anno> annoSet) {
        this.annoSet = annoSet;
    }
    @org.springframework.beans.factory.annotation.Autowired
    public void setAnnoMap(Map<String, Anno> annoMap) {
        this.annoMap = annoMap;
    }

    public Anno getAnno() {
        System.out.println("One Element:"+anno);
        return anno;
    }

    public Anno[] getAnnos() {
        System.out.println("Array Elements:"+annos[0]);
        return annos;
    }

    public Set<Anno> getAnnoSet() {
        System.out.println("Set Elements:"+annoSet);
        return annoSet;
    }

    public Map<String, Anno> getAnnoMap() {
        System.out.println("Map Elements:"+annoMap);
        return annoMap;
    }
}
