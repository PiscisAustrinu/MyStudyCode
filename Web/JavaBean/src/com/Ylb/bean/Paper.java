package com.Ylb.bean;

import java.io.Serializable;

public class Paper implements Serializable {
    private static final long serialVersionUID = 1L;
    //定义保存编程语言的字符串的数组
    private String[] languages;
    //定义保存掌握技术的字符串数组
    private String[] technics;
    //定义保存困难部分的字符串数组
    private String[] parts;

    public Paper() {
    }

    public String[] getLanguages() {
        return languages;
    }

    public String[] getTechnics() {
        return technics;
    }

    public void setTechnics(String[] technics) {
        this.technics = technics;
    }

    public String[] getParts() {
        return parts;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
