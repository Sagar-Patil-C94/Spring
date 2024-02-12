package com.ivoyant.springandspringboot;

import com.ivoyant.components.ComponentPersonDao;
import com.ivoyant.springandspringboot.scope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ivoyant.components")
public class SpringComponentScanApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringComponentScanApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicApplication.class, args);
        ComponentPersonDao personDao = applicationContext.getBean(ComponentPersonDao.class);
        logger.info("{}",personDao);
    }
}
