package com.Ylb.Spring5.Anno;

import javax.inject.Inject;
import javax.inject.Named;

public class InjectNamedAnno {

    @Inject                             //1、构造函数注入依赖对象
    public InjectNamedAnno(Anno anno) {
        this.anno = anno;
    }
    @Inject                             //2、属性注入依赖对象
    private Anno anno;
//    @Inject                             //3、属性setter方法注入依赖对象
//    public void setAnno(Anno anno) {
//        this.anno = anno;
//    }
//
    @Inject
    public void setAnno(@Named("anno") Anno anno) {             //结合@Named注入指定名字的依赖
        this.anno = anno;
    }
}
