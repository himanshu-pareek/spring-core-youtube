package main;

import config.ProjectConfig;
import config.RepositoryConfig;
import config.ServiceConfig;
import db.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.BookRepository;
import services.BookService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(context.getBean(BookService.class));
        System.out.println(context.getBean(BookRepository.class));
        System.out.println(context.getBean(DataSource.class));
    }
}
