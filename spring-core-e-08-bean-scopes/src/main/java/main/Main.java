package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AuthorService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        var service = context.getBean(AuthorService.class);
        var service2 = context.getBean(AuthorService.class);
        System.out.println(service);
        System.out.println(service2);

        Thread thread = new Thread(() -> {
            var service3 = context.getBean(AuthorService.class);
            System.out.println(service3);
        });
        thread.start();
    }
}
