package com.Ylb.SpringBoot;

import com.Ylb.SpringBoot.bean.pet;
import com.Ylb.SpringBoot.bean.user;
import com.Ylb.SpringBoot.config.SpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Author：Yang Lingbo
 * Date:2022/3/24 20:53
 * Description: @SpringBootApplication 这是一个SpringBoot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
//        获取IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
//        获取组件名称
        String[] names = run.getBeanDefinitionNames();
        for (String name:
             names) {
            System.out.println(name);
        }

        user user = run.getBean("getUser", com.Ylb.SpringBoot.bean.user.class);
        pet pet = run.getBean("getPet", com.Ylb.SpringBoot.bean.pet.class);
        System.out.println(user);
        System.out.println(pet);
        SpringConfig config = run.getBean(SpringConfig.class);
        com.Ylb.SpringBoot.bean.user user1 = config.getUser();
        com.Ylb.SpringBoot.bean.user user2 = config.getUser();
        System.out.println(user1==user2);
        System.out.println("用户的宠物："+(user1.getPet()==pet));
    }
}
