package com.ivoyant.springandspringboot.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ClassLife {
    Logger logger = LoggerFactory.getLogger(ClassLife.class);

    public ClassLife() {
        logger.info("Constructor");
    }
    @PostConstruct
    public void postConstruct(){
        logger.info("PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("PreDestroy");
    }
}
