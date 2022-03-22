package com.Ylb.Spring5.testdemo;

import com.Ylb.Spring5.*;
import com.Ylb.Spring5.Aware_user.UserService;
import com.Ylb.Spring5.BeanFactoryPostProcessor.HelloService;
import com.Ylb.Spring5.MethodReplacer.OldEraPeople;
import com.Ylb.Spring5.Service.Service;
import com.Ylb.Spring5.bean.Employee;
import com.Ylb.Spring5.book.Foo;
import com.Ylb.Spring5.book.InstanceFactory;
import com.Ylb.Spring5.book.StaticFactoryService;
import com.Ylb.Spring5.colletion.Course;
import com.Ylb.Spring5.colletion.Stu;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring5 {
    @Test
    public void testAdd(){
//        1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        2、获取配置的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        People people = context.getBean("people",People.class);
        System.out.println(people);
        people.testDI();
    }

    @Test
    public void testStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Student student = context.getBean("student",Student.class);
        System.out.println(student);
        student.studentTest();
    }

    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Service service  = context.getBean("service",Service.class);
        service.service();
    }

    @Test
    public void testInnerBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Employee employee = context.getBean("employee1",Employee.class);
        employee.testEmployee();
        System.out.println(context);
    }

    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu",Stu.class);
        stu.testCollection();
        System.out.println(stu);
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Course course = context.getBean("myBean",Course.class);
        System.out.println(course);
    }

    @Test
    public void testLifeCircle(){
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("bean1.xml");
        LifeCircle lifeCircle = context.getBean("LifeCircle",LifeCircle.class);
        System.out.println("第四步:创建Bean实例对象");
        System.out.println(lifeCircle);
        context.close();
    }

    @Test
    public void testAutowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        com.Ylb.Spring5.autowire.Student student = context.getBean("student", com.Ylb.Spring5.autowire.Student.class);
        System.out.println(student);
    }
    /*
    @Test
    public void testInnerClass(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        OuterClass.InnerClass innerClass = context.getBean("innerObject",OuterClass.InnerClass.class);
        innerClass.innerMethod();
    }
     **/

    @Test
    public void testStaticFactory(){
//        直接通过静态工厂方法创建对象
        System.out.println(StaticFactoryService.getInstance());
//        通过Bean实例对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        StaticFactoryService service =  context.getBean("staticFactoryService",StaticFactoryService.class);
        System.out.println(service);
//        通过对象创建实例
        StaticFactoryService service1 = new StaticFactoryService();
        System.out.println(service1);
    }

    @Test
    public void testInstanceFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        InstanceFactory factory = context.getBean("instanceFactory",InstanceFactory.class);
        System.out.println(factory.getFooInstance());

        Foo foo = context.getBean("foo",Foo.class);
        System.out.println(foo);

        Foo foo1 = new Foo();
        System.out.println(foo1);
    }

    @Test
    public void testParent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        parent parent = context.getBean("childBean", com.Ylb.Spring5.parent.class);
        System.out.println(parent);
    }

    @Test
    public void testMethodReplacer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        OldEraPeople oldEraPeople = context.getBean("oldEraPeople",OldEraPeople.class);
        oldEraPeople.eat("杨凌波");
    }

    @Test
    public void testBeanFactoryPostProcessor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        HelloService helloService = context.getBean("helloService",HelloService.class);
        System.out.println(helloService.toString());
    }

    /**
     * 测试使用Aware接口注册用户
     */
    @Test
    public void testAwareRegisterUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService",UserService.class);
        com.Ylb.Spring5.Aware_user.User user = context.getBean("user1", com.Ylb.Spring5.Aware_user.User.class);
        System.out.println(userService.register(user));
    }
}
