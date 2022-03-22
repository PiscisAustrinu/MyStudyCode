package com.Ylb.bean;

import java.io.Serializable;

public class Email implements Serializable {
    private static final long serialVersionUID = 1L;
    //email地址
    private String mailAdd;
    //是否是一个标准的email地址
    private boolean email;

    /**
     * 无参构造方法
     */
    public Email() {
    }

    /**
     * 含参构造方法
     * @param mailAdd
     */
    public Email(String mailAdd) {
        this.mailAdd = mailAdd;
    }

    /**
     * 判断邮箱格式是否错误
     * @return mail，true格式正确，false格式错误
     */
    public boolean isEmail(){
        //正则表达式，设置邮箱格式
        String regex = "^[A-Za-z0-9\\u4e00-\\u9fa5]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
        if(mailAdd.matches(regex)){
            email = true;
        }
        return email;
    }

    public String getMailAdd() {
        return mailAdd;
    }

    public void setMailAdd(String mailAdd) {
        this.mailAdd = mailAdd;
    }
}
