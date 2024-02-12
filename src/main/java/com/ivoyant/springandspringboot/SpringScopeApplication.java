package com.ivoyant.springandspringboot;

import com.ivoyant.springandspringboot.scope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class SpringScopeApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringScopeApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicApplication.class, args);
        PersonDao personDao = applicationContext.getBean(PersonDao.class);
        PersonDao personDao1 = applicationContext.getBean(PersonDao.class);
        logger.info("{}",personDao);
        logger.info("{}",personDao.getConnection());
        logger.info("{}",personDao1);
        logger.info("{}",personDao1.getConnection());
    }
}
