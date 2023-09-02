package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.AuthorService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AuthorService authorService = context.getBean(AuthorService.class);
        authorService.printRepository();
        authorService.printRepository();
    }
}
