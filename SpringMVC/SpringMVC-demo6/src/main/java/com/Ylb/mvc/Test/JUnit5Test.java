package com.Ylb.mvc.Test;

import com.Ylb.mvc.Bean.User;
import com.Ylb.mvc.Convert.MyDateConvert;
import com.Ylb.mvc.Convert.MyDatePropertyEditor;
import com.Ylb.mvc.Convert.MyUserConvert;
import com.Ylb.mvc.config.SpringConfig;
import com.Ylb.mvc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/**
 * Author：Yang Lingbo
 * Date:2022/3/15 10:52
 * Description:
 */
@ComponentScan("com.Ylb.mvc")
public class JUnit5Test {
    @Test
    public void testMyDatePropertyEditor(){
        PropertyEditorSupport dataPropertyEditor = new MyDatePropertyEditor();
        dataPropertyEditor.setAsText("2022-03-15");
        Date date = (Date) dataPropertyEditor.getValue();
        //使用Spring提供的日期类型的编辑器
//        CustomDateEditor customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),false);
//        customDateEditor.setAsText("2022-03-15");
//        Object data = customDateEditor.getValue();
        System.out.println(date);
    }
    @Test
    public void convertIndepUse(){
//        初始化转换器
        ConversionService conversionService = new DefaultConversionService();
//        字符串类型转换成日期
        Date date = conversionService.convert("2022/03/15", Date.class);
        System.out.println(date);
    }
    @Test
    public void StringToUser(){
//        初始化转换器服务
        DefaultConversionService defaultConversionService = new DefaultConversionService();
//        添加转换器
        defaultConversionService.addConverter(new MyUserConvert());
//        进行转换
        User user = defaultConversionService.convert("杨凌波,2001/02/11", User.class);
        System.out.println(user.toString());
    }
    @Test
    public void DateInternation() throws ParseException {
        DateFormatter dateFormatter = new DateFormatter();  //日期格式转换器
//        中国区时间
        String China = dateFormatter.print(new Date(), Locale.CHINESE);
//        英国区时间
        String English = dateFormatter.print(new Date(), Locale.ENGLISH);
        System.out.println(China);
        System.out.println(English);
    }

    /**
     * 使用BeanWrapperImpl对user进行封装，并设置属性值
     */
    @Test
    public void testBeanWrapper(){
        User user = new User();
        BeanWrapperImpl userWrapper = new BeanWrapperImpl(user);
        userWrapper.setPropertyValue("name","杨凌波");
        userWrapper.setPropertyValue("birthday",new Date());
        System.out.println(userWrapper.getPropertyValue("name"));
        System.out.println(userWrapper.getPropertyValue("birthday"));
    }

    /**
     * 在BeanWrapper中使用PropertyEditor
     */
    @Test
    public void testBeanWrapperAndEditor(){
        User user = new User();
        BeanWrapperImpl userWrapper = new BeanWrapperImpl(user);
        userWrapper.registerCustomEditor(Date.class,new MyDatePropertyEditor());
        userWrapper.setPropertyValue("name","杨凌波");
        userWrapper.setPropertyValue("birthday","2001-02-11");
        System.out.println(userWrapper.getPropertyValue("name"));
        System.out.println(userWrapper.getPropertyValue("birthday"));
    }
    /**
     *  BeanWrapper通过setConversionService()设置转换器服务
     */
    @Test
    public void testBeanWrapperAndConversionService(){
        User user = new User();
        BeanWrapperImpl userWrapper = new BeanWrapperImpl(user);
        DefaultConversionService conversionService =  new DefaultConversionService();
        conversionService.addConverter(new MyDateConvert());
        userWrapper.setConversionService(conversionService);
        userWrapper.setPropertyValue("birthday","2001-02-11");
        System.out.println(userWrapper.getPropertyValue("birthday"));
    }

    /**
     * 测试数据绑定器DataBinder
     */
    @Test
    public void testDataBinder(){
        User user = new User();
//        绑定对象
        DataBinder dataBinder = new DataBinder(user,user.getClass().getName());
//        创建转换器服务
        DefaultConversionService conversionService = new DefaultConversionService();
//        将自定义转换器注入转换器服务
        conversionService.addConverter(new MyDateConvert());
//        添加转换器
        dataBinder.setConversionService(conversionService);
//        初始化属性值对象
        MutablePropertyValues propertyValues = new MutablePropertyValues();
//        添加name属性值
        propertyValues.addPropertyValue("name","杨凌波");
//        添加birthday属性值
        propertyValues.addPropertyValue("birthday","2001-02-11");
//        绑定属性值
        dataBinder.bind(propertyValues);
//        得到绑定后的结果
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult.getTarget());
    }

    /**
     * 测试Bval验证器
     * @throws ParseException
     */
    @Test
    public void testValidation() throws ParseException{
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator(); //构造验证器
        User user = new User();
        user.setName("杨凌波");
        user.setBirthday(new Date());
        user.setAge(180);      //设置对象年龄
//        验证并返回验证结果
        Set<ConstraintViolation<User>> validatorSet = validator.validate(user);
//        打印有问题的属性和错误信息
        for (ConstraintViolation<User> data:validatorSet){
            System.out.println(data.getPropertyPath().toString()+":"+data.getMessage());
        }
    }
    @Test
    public void testBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user",User.class);
        System.out.println(user.getName());
    }

    @Test
    public void testMethodValidationPostProcessor(){
        UserService userService = new UserService();
        User user = userService.getUser();
        System.out.println(user.getAge());
    }
}
