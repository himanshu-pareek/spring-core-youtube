package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.BookRepository;
import services.BookService;

@Configuration
public class ServiceConfig {
    @Bean
    public BookService bookService(BookRepository bookRepository) {
        return new BookService(bookRepository);
    }
}
