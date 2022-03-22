package com.Ylb.Spring5.Aware_user;

import org.springframework.context.ApplicationListener;

/**
 * 监听发布的UserRegisterEvent时间
 */
public class UserEventListener implements ApplicationListener<UserRegisterEvent> {   //监听器
    @Override    //        监听注册成功后的处理
    public void onApplicationEvent(UserRegisterEvent event) {
        System.out.println("注册成功后发送邮件："+event.getUser().getName());
    }
}
