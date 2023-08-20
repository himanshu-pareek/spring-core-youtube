package repositories;

import db.DataSource;

public class AuthorRepository {

    private String tableName;
    private DataSource dataSource;

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return "AuthorRepository{" +
                "tableName='" + tableName + '\'' +
                ", dataSource=" + dataSource +
                '}';
    }
}
