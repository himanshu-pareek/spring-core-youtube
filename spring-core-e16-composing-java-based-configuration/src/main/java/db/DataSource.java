package db;

import java.beans.ConstructorProperties;

public class DataSource {
    private final String databaseUrl;
    private final String username;
    private final String password;

    @ConstructorProperties({"databaseUrl", "username", "password"})
    public DataSource(
            String databaseUrl,
            String username,
            String password
    ) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
