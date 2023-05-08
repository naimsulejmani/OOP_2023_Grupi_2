package interfaces.db_project.interfaces;

import interfaces.db_project.exceptions.SQLException;

import java.util.List;

public interface DbConnection {
    DbConnection connect() throws SQLException;

    void disconnect() throws SQLException;

    boolean isConnected();

    boolean isDisconnected();

    void close() throws SQLException;

    int execute(String query) throws SQLException;

    List<Object> executeReader(String query) throws SQLException;

}











