package main;

import author.Author;
import author.AuthorService;
import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                ProjectConfig.class
        );
        Author author = new Author("Abc", "Def");
        AuthorService authorService = context.getBean(AuthorService.class);
        Locale hiIn = new Locale("hi", "In");
        authorService.printAuthoredBooks(
                author,
                20,
                hiIn
        );
        System.out.println(Locale.ENGLISH);
        System.out.println(Locale.US);
        System.out.println(Locale.UK);
        System.out.println(Locale.CHINA);
        System.out.println(hiIn);
    }
}
