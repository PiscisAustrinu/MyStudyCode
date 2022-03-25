package com.Ylb.SpringBoot.config;

import com.Ylb.SpringBoot.bean.pet;
import com.Ylb.SpringBoot.bean.user;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Author：Yang Lingbo
 * Date:2022/3/25 10:49
 * Description:
 * 1、配置类里面使用@Bean标注在方法赏给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods:代理Bean的方法
 *  Full(proxyBeanMethods = true)【保证每个@Bean方法被调用多次返回的组件都是单实例的】
 *  Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新建的】
 *  组建依赖必须使用Full模式默认，其他都是Lite模式
 * 4、@Import(user.class)
 *  给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 */
@Import(user.class)
@Configuration(proxyBeanMethods = true)
public class SpringConfig {
    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册到容器中的单实例对象
     * @return
     */
    @Bean
    public user getUser(){
        user user = new user("杨凌波",21);
        user.setPet(getPet());
        return user;
    }
    @Bean
    public pet getPet(){
        return new pet("Tomcat");
    }
}
