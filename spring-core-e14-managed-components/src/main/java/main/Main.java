package main;

import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.SimpleThreadScope;
import repositories.BookRepository;
import services.BookService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.getBeanFactory().registerScope("thread", new SimpleThreadScope());
        context.register(ProjectConfig.class);
        context.refresh();
        context.getBeansOfType(BookRepository.class)
                .forEach((beanName, bean) -> System.out.println(beanName + " " + bean));
//        BookService bookService = context.getBean(BookService.class);
//        System.out.println(bookService);
//        Thread thread = new Thread(() -> {
//            BookService bookService2 = context.getBean(BookService.class);
//            System.out.println(bookService2);
//        });
//        thread.start();
    }
}
