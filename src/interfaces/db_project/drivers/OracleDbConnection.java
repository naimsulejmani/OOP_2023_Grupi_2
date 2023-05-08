package interfaces.db_project.drivers;

import interfaces.db_project.exceptions.SQLException;
import interfaces.db_project.interfaces.DbConnection;

import java.util.ArrayList;
import java.util.List;

public class OracleDbConnection implements DbConnection {
    private String url;
    private boolean connected = false;

    public OracleDbConnection(String url) {
        if (url.split(";").length < 4)
            throw new IllegalArgumentException("Invalid argument number on url");

        this.url = url;
    }


    @Override
    public DbConnection connect() throws SQLException {
        if (isConnected()) return this;
        connected = true;
        System.out.println("MSSQL - Connection successfully made!");
        return this;

//        if(isDisconnected())
//            System.out.println("Connection successfully made!");
//        return this;
    }

    @Override
    public void disconnect() throws SQLException {
        if (isDisconnected()) {
            System.out.println("Oracle - Already disconncted!");
        } else {
            connected = false;
            System.out.println("Oracle - Disconecting...");
            System.out.println("Oracle - Successfully disconnected!");
        }
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public boolean isDisconnected() {
        return !connected;
    }

    @Override
    public void close() throws SQLException {
        if (isConnected()) {
            System.out.println("Oracle - Trying to close");
            System.out.println("Oracle - Closing successfully!");
        } else {
            throw new SQLException("Oracle- Cannot close in disconnected environments");
        }
    }

    // DDL - CREATE, ALTER , DROP , TRUNCATE
    // DML - INSERT, UPDATE, DELETE
    // EXEC / EXECUTE
    @Override
    public int execute(String query) throws SQLException {
        if (query.toLowerCase().startsWith("insert") || query.toLowerCase().startsWith("update")
                || query.toLowerCase().startsWith("delete")) {
            System.out.println(query);
            return 1;
        }
        throw new SQLException("Not allowed command!");

    }

    // DQL - SELECT
    // EXEC / EXECUTE / FUNCTION
    @Override
    public List<Object> executeReader(String query) throws SQLException {
        if (query.toLowerCase().startsWith("select")) {
            System.out.println(query);
            return new ArrayList<>();
        }
        throw new SQLException("Not allowed command!");
    }
}
