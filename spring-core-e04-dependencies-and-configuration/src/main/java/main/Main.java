package main;

import com.sun.tools.jconsole.JConsoleContext;
import demo.CollectionsDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.AuthorRepository;
import services.AuthorService;

public class Main {
    public static void main(String[] args) {
        // 1. Inner Beans
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans-inner.xml");
//        AuthorService authorService = context.getBean(AuthorService.class);
//        System.out.println(authorService);
//        AuthorRepository authorRepository = context.getBean(AuthorRepository.class);
//        System.out.println(authorRepository);

        // 2. Collections
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-collections.xml");
//        CollectionsDemo collectionsDemo = applicationContext.getBean(CollectionsDemo.class);
//        System.out.println(collectionsDemo);

        // 4. Depends On Relationship
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-depends-on.xml");
    }
}
