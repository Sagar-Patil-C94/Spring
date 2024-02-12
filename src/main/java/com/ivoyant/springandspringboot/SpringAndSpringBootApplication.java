package com.ivoyant.springandspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAndSpringBootApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringAndSpringBootApplication.class, args);
        ClassImpl classImpl = applicationContext.getBean(ClassImpl.class);
        ClassImpl classImpl1 = applicationContext.getBean(ClassImpl.class);
        System.out.println(classImpl);
        System.out.println(classImpl1);
        System.out.println(classImpl.greeting());
    }

}
