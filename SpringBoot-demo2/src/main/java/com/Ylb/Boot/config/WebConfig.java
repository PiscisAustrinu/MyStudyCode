package com.Ylb.Boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

/**
 * Author：Yang Lingbo
 * Date:2022/3/28 9:56
 * Description: 添加或者修改web的配置
 */
@Configuration(proxyBeanMethods = false)
public class WebConfig {
    /**
     * 自定义HiddenHttpMethodFilter的MethodeParam属性
     * @return hiddenHttpMethodFilter
     */
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        hiddenHttpMethodFilter.setMethodParam("_m");
        return hiddenHttpMethodFilter;
    }
}
