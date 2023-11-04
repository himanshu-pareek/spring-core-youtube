package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import repositories.BookRepository;
import services.BookService;

@Configuration
public class  ProjectConfig{

    @Bean
    public BookService bookService() {
        System.out.println("Injecting " + bookRepository());
        var bookService = new BookService();
        bookService.setBookRepository(bookRepository());
        return bookService;
    }

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }
}
