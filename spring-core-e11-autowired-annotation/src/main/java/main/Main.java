package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.BookRepository;
import services.BookService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BookService bookService = context.getBean(BookService.class);
        // BookRepository bookRepository = context.getBean(BookRepository.class);
        System.out.println(bookService);
        // System.out.println(bookRepository);
    }
}
