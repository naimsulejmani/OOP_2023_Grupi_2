package interfaces.db_project;

import interfaces.db_project.drivers.MssqlDbConnection;
import interfaces.db_project.drivers.MySqlDbConnection;
import interfaces.db_project.drivers.OracleDbConnection;
import interfaces.db_project.exceptions.SQLException;
import interfaces.db_project.interfaces.DbConnection;

import java.util.List;

public class DbProjectTest {
    private static DbConnection connection = null;

    public static void main(String[] args) {
        args = new String[]{
                "oracle", "Server=myServerAddress;Database=myDataBase;User Id=myUsername;Password=myPassword"
        };

        if (args.length == 2) {
            String driver = args[0];
            String url = args[1];

            connection = switch (driver) {
                case "mssql" -> new MssqlDbConnection(url);
                case "mysql" -> new MySqlDbConnection(url);
                case "oracle" -> new OracleDbConnection(url);
                default -> new MySqlDbConnection(url);
            };


            try {
                connection.connect();
                connection.execute("INSERT INTO User Values(1,'Naim');");
                var list = connection.executeReader("SELECT * FROM User");
                connection.close();
                connection.disconnect();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
