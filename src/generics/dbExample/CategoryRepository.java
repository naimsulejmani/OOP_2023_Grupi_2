package generics.dbExample;

import java.sql.*;
import java.util.List;

public class CategoryRepository implements CrudRepository<Category, Integer>{
    private static final String CONNECTION_STRING = "jdbc:sqlserver://127.0.0.1:1433;encrypt=false;databaseName=Northwind;username=sa;password=yourStrong(!)Password";

    @Override
    public void add(Category item) {
        String query = "INSERT INTO dbo.Categories (CategoryName, Description) VALUES (?,?)";
        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING); PreparedStatement stmt = connection.prepareStatement(query);) {
            stmt.setString(1, item.getCategoryName());
            stmt.setObject(2, item.getDescription(), Types.NVARCHAR);

            int rowAffected = stmt.executeUpdate();
            System.out.println(rowAffected + " rows affected!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void modify(Integer id, Category item) {

    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category findById(Integer id) {
        return null;
    }
}
