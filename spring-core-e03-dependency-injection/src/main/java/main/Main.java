package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.AuthorRepository;
import services.AuthorService;
import services.EmailService;

public class Main {
    public static void main(String[] args) {
        // 1. Setter based dependency injection
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans-setter.xml");

        // 2. Constructor based dependency injection
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans-constructor.xml");

        // 3. Factory based dependency injection
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");

        AuthorService authorService = context.getBean(AuthorService.class);
        AuthorRepository authorRepository = context.getBean(AuthorRepository.class);
        EmailService emailService = context.getBean(EmailService.class);
        System.out.println(authorService);
        System.out.println(authorRepository);
        System.out.println(emailService);
    }
}
