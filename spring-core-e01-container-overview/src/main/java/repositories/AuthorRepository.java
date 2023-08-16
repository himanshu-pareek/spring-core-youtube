package repositories;

public class AuthorRepository {

    private String databaseUrl;

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    @Override
    public String toString() {
        return "AuthorRepository{" +
                "databaseUrl='" + databaseUrl + '\'' +
                '}';
    }
}
