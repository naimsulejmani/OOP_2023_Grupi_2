package db_project.infrastructures;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Convertable<T> {
    T convert(ResultSet resultSet) throws SQLException;
}
