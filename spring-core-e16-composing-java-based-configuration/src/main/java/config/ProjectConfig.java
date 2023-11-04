package config;

import db.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({ServiceConfig.class, RepositoryConfig.class})
@PropertySource({"classpath:db/config.properties"})
public class ProjectConfig {

//    @Value("${books.db.url}")
//    private String databaseUrl;
//
//    @Bean
//    public DataSource dataSource() {
//        return new DataSource(
//                databaseUrl,
//                "user",
//                "pass"
//        );
//    }
}
