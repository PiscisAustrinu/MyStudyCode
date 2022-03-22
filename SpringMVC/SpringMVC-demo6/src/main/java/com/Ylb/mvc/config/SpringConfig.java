package com.Ylb.mvc.config;

import com.Ylb.mvc.Bean.User;
import com.Ylb.mvc.Convert.MyDateConvert;
import com.Ylb.mvc.Convert.MyDatePropertyEditor;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.validation.beanvalidation.BeanValidationPostProcessor;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Author：Yang Lingbo
 * Date:2022/3/15 20:25
 * Description:
 */
@Configuration
@ComponentScan("com.Ylb.mvc")
public class SpringConfig {
    /**
     * 向容器中加入自定义的属性编辑器
     * 在属性propertyEditorRegisters中注入自定义编辑器类型的Bean
     * @param myDatePropertyEditor
     * @return customEditorConfigurer
     */
    @Bean
    public CustomEditorConfigurer getCustomEditorConfigurer(MyDatePropertyEditor myDatePropertyEditor){
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        PropertyEditorRegistrar[] propertyEditorRegistrars = new PropertyEditorRegistrar[]{myDatePropertyEditor};
        customEditorConfigurer.setPropertyEditorRegistrars(propertyEditorRegistrars);
        return customEditorConfigurer;
    }

    /**
     * 向转换器服务注入自定义的转换器
     * @param myDateConvert
     * @return formattingConversionServiceFactoryBean
     */
    @Bean(name = "conversionService")
    public FormattingConversionServiceFactoryBean getConversionService(MyDateConvert myDateConvert){
        FormattingConversionServiceFactoryBean formattingConversionServiceFactoryBean = new FormattingConversionServiceFactoryBean();
        Set<Object> converters = new HashSet<>();
        converters.add(myDateConvert);
        formattingConversionServiceFactoryBean.setConverters(converters);
        return formattingConversionServiceFactoryBean;
    }

    /**
     * 配置BeanValidationPostProcessor的Bean
     * @return BeanValidationPostProcessor
     */
    @Bean
    public BeanValidationPostProcessor getBeanValidationPostProcessor(){
        return new BeanValidationPostProcessor();
    }

    /**
     * 创建一个UserBean，Age设置为180，该Bean用来进行Bean有效性验证
     * @return user
     */
    @Bean
    public User user(){
        User user = new User();
        user.setName("杨凌波");
        user.setAge(80);
        user.setBirthday(new Date());
        return user;
    }

    /**
     * 配置方法级别的有效验证器
     * @return MethodValidationPostProcessor
     */
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor(){
        return new MethodValidationPostProcessor();
    }

}
