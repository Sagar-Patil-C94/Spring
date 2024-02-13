package com.ivoyant.springandspringboot;

import com.ivoyant.springandspringboot.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {
    static Logger logger = LoggerFactory.getLogger(SpringPropertiesApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicApplication.class, args);
        SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
        logger.info("{}", someExternalService);
        logger.info("{}", someExternalService.getSomeExternalURL());
    }
}
