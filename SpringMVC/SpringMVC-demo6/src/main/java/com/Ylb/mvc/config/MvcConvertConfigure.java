package com.Ylb.mvc.config;

import com.Ylb.mvc.Convert.MyDateConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.PostConstruct;

/**
 * Author：Yang Lingbo
 * Date:2022/3/16 9:26
 * Description:
 */
//@Configuration
@EnableWebMvc
public class MvcConvertConfigure extends WebMvcConfigurationSupport {
    @Autowired          //自动装载转换器服务对象
    private FormattingConversionService formattingConversionService;
    @PostConstruct
    public void addCustomConvert(){
        if (formattingConversionService!=null){
            formattingConversionService.addFormatter((Formatter<?>) new MyDateConvert());
        }
    }
}
