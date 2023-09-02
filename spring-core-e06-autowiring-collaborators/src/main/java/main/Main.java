package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.AuthorRepository;
import services.AuthorService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AuthorService service = context.getBean(AuthorService.class);
        // AuthorRepository repository = context.getBean(AuthorRepository.class);
        System.out.println(service);
        // System.out.println(repository);
    }
}
