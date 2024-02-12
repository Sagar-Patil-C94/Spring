package com.ivoyant.springandspringboot;

import com.ivoyant.springandspringboot.basic.ClassImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ivoyant.springandspringboot")
public class SpringBasicApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicApplication.class);
        ClassImpl classImpl = applicationContext.getBean(ClassImpl.class);
        ClassImpl classImpl1 = applicationContext.getBean(ClassImpl.class);
        System.out.println(classImpl);
        System.out.println(classImpl1);
        System.out.println(classImpl.greeting());
    }
}