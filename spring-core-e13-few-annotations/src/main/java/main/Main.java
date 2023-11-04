package main;

/*

        1. @Value - To inject externalize dependency
            For example, value from properties file, system properties, SpEL

        2. @PostConstruct - To perform any action after successful construction of a bean

        3. @PreDestroy - To perform any action just before destroying a bean / container

 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.BookRepository;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BookRepository bookRepository = context.getBean(BookRepository.class);
        System.out.println(bookRepository);
        context.close();
    }
}
