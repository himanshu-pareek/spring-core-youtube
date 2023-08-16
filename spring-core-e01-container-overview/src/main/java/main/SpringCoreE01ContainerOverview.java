package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.AuthorRepository;
import services.AuthorService;

public class SpringCoreE01ContainerOverview {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AuthorService authorService = context.getBean("authorService", AuthorService.class);
        AuthorRepository authorRepository = context.getBean("testAuthorRepository", AuthorRepository.class);
        System.out.println(authorService);
        System.out.println(authorRepository);
        System.out.println(authorService.getRepository() == authorRepository);
    }
}
