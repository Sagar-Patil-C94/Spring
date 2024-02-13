package spring.unit.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring.unit.test")
public class SpringUnitTestApplication {
    static Logger logger = LoggerFactory.getLogger(SpringUnitTestApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringUnitTestApplication.class)) {
            SomeBusinessOperation someBusinessOperation = applicationContext.getBean(SomeBusinessOperation.class);
            logger.info("{}", someBusinessOperation.search(10));
        }
    }
}
