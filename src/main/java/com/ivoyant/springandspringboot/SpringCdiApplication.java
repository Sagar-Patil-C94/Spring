package com.ivoyant.springandspringboot;

import com.ivoyant.springandspringboot.beanlifecycle.ClassLife;
import com.ivoyant.springandspringboot.cdi.SomeBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCdiApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringCdiApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringCdiApplication.class, args);
        SomeBusiness someBusiness = applicationContext.getBean(SomeBusiness.class);
        logger.info("{}", someBusiness);
        logger.info("{}", someBusiness.getDao());
    }
}