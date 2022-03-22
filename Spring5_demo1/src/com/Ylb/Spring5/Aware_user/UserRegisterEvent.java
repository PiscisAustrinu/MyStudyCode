package com.Ylb.Spring5.Aware_user;

import org.springframework.context.ApplicationEvent;


public class UserRegisterEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    private User user;   //属性
//    Source是发布事件的对象
    public UserRegisterEvent(Object source, User user) {
        super(source);
        this.user = user;
    }
    public User getUser() {
        return user;
    }
}
