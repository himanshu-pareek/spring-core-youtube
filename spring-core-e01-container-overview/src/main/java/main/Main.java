package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.AuthorRepository;
import services.AuthorService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        AuthorService authorService = applicationContext.getBean(AuthorService.class);
        AuthorRepository authorRepository = applicationContext.getBean("testAuthorRepository", AuthorRepository.class);
        System.out.println(authorService);
        System.out.println(authorRepository);
    }
}
