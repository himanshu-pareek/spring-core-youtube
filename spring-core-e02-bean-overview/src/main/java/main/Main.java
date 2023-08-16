package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.AuthorService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        AuthorService authorService = context.getBean(AuthorService.class);
        System.out.println(authorService);
//        AuthorService authorService2 = context.getBean("authorService2", AuthorService.class);
//        System.out.println(authorService2);
//        System.out.println(context.getBean("a", AuthorService.class));
//        System.out.println(context.getBean("b", AuthorService.class));
//        System.out.println(context.getBean("c", AuthorService.class));
    }
}
