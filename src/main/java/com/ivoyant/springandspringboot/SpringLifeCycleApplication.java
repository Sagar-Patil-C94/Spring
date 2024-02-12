package com.ivoyant.springandspringboot;

import com.ivoyant.springandspringboot.beanlifecycle.ClassLife;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLifeCycleApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringLifeCycleApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringLifeCycleApplication.class, args);
        ClassLife classLife = applicationContext.getBean(ClassLife.class);
        logger.info("{}", classLife);
    }
}