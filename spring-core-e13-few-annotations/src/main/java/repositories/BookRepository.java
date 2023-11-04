package repositories;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BookRepository {

    @Value("${books.database.url:defaulturl}")
    private String databaseUrl;


    @PostConstruct
    public void init() {
        System.out.println("Connecting to database " + databaseUrl + " ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Disconnecting from database " + databaseUrl + " ...");
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "databaseUrl='" + databaseUrl + '\'' +
                '}';
    }
}
