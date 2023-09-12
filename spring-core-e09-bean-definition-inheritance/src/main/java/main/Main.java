package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.AuthorRepository;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AuthorRepository authorRepository = context.getBean("authorRepository", AuthorRepository.class);
        AuthorRepository testAuthorRepository = context.getBean("testAuthorRepository", AuthorRepository.class);
        System.out.println(authorRepository);
        System.out.println(testAuthorRepository);
    }
}
