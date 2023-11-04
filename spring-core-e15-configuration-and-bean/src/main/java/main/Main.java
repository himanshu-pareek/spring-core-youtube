package main;

import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.BookService;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService);
        context.close();
    }
}
