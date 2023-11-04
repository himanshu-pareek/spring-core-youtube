package repositories;

import db.DataSource;

public class BookRepository {

    private final DataSource dataSource;

    public BookRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "dataSource=" + dataSource +
                '}';
    }
}
