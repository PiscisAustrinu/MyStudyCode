package com.Ylb.Spring5.Aware_user;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class UserService implements ApplicationEventPublisherAware {
//    应用事件发布器属性
    private ApplicationEventPublisher applicationEventPublisher;
    @Override            //重载方法设置应用事件发布器
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
    public boolean register(User user){     //用户注册方法
        System.out.println("用户【"+user.getName()+"】注册成功！");
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this,user));   //事件发布
        return true;
    }
}
