package db_project.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbHelper {
    private static final String CONNECTION_URL = "jdbc:sqlserver://127.0.0.1:1433;encrypt=false;databaseName=Northwind;username=sa;password=sa";
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(CONNECTION_URL);
        }
        return connection;
    }
}





