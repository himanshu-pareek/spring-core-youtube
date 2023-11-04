package config;

import db.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import profiles.Production;

@Configuration
// @Import({ProdDataConfig.class, DevDataConfig.class})
@PropertySource({"classpath:db/config.properties"})
public class ProjectConfig {
    @Bean("dataSource")
    @Profile({"development"})
    public DataSource devDataSource() {
        return new DataSource(
                "jdbc:mysql://localhost:3306/test",
                "dev",
                "pass"
        );
    }

    @Value("${db.url}")
    private String databaseUrl;
    @Value("${db.username:dev}")
    private String username;
    @Value("${db.password:pass}")
    private String password;

    @Bean("dataSource")
    @Production
    public DataSource prodDataSource() {
        return new DataSource(
                databaseUrl,
                username,
                password
        );
    }
}
