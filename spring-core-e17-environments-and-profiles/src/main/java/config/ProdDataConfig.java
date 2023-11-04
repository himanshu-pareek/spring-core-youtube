package config;

import db.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import profiles.Production;

@Configuration
@Production
public class ProdDataConfig {

    @Bean
    public DataSource dataSource() {
        return new DataSource(
                "jdbc:mysql://197.100.43.23:8080/javarush",
                "user12345",
                "AFGcvRG32@$#eddhohosng"
        );
    }
}
