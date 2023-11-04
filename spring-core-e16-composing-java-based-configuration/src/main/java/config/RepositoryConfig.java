package config;

import db.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.BookRepository;

@Configuration
public class RepositoryConfig {
    @Bean
    public BookRepository bookRepository(DataSource dataSource) {
        return new BookRepository(dataSource);
    }
}
