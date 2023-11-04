package config;

import db.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class DevDataConfig {

    @Bean
    public DataSource dataSource() {
        return new DataSource(
                "jdbc:mysql://localhost:3306/test",
                "dev",
                "pass"
        );
    }
}
