package xmlbasedspringconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class SpringXmlApplication {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext("applicationcontext.xml")) {
            System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
            PersonDao personDao = applicationContext.getBean(PersonDao.class);
            System.out.println(personDao);
            System.out.println(personDao.getJdbcConnection());
        }
    }
}
