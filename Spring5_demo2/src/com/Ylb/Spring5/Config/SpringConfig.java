package com.Ylb.Spring5.Config;

import com.Ylb.Spring5.Anno.Anno;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration      //作为配置类，代替xml文件
@ComponentScan(basePackages = "com.Ylb.Spring5")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
    @Bean(name = "annoBean" ,value = "annoBean")
    public Anno myInitAnno(){
        return new Anno();
    }
}
