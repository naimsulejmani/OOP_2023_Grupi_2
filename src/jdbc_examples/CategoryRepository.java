package jdbc_examples;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    private static final String CONNECTION_STRING = "jdbc:sqlserver://127.0.0.1:1433;encrypt=false;databaseName=Northwind;username=sa;password=yourStrong(!)Password";

    public static void main(String[] args) {
        addCategory(new Category("CS:GO", "1:1"));


        List<Category> categories = getAllCategories();
        for (Category category : categories) {
            System.out.println(category);
        }
    }

    public static void addCategory(Category category) {
        String query = "INSERT INTO dbo.Categories (CategoryName, Description) VALUES (?,?)";
        try (
                Connection connection = DriverManager.getConnection(CONNECTION_STRING);
                PreparedStatement stmt = connection.prepareStatement(query);
        ) {
            stmt.setString(1, category.getCategoryName());
            stmt.setObject(2, category.getDescription(), Types.NVARCHAR);

            int rowAffected = stmt.executeUpdate();
            System.out.println(rowAffected + " rows affected!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Category> getAllCategories() {
        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            String query = "SELECT * FROM dbo.Categories";

            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            List<Category> categories = new ArrayList<>();
            while (resultSet.next()) {
                int categoryId = resultSet.getInt(1);
                String categoryName = resultSet.getString("CategoryName");
                String description =
                        resultSet.getObject("Description") != null ?
                                resultSet.getObject("Description", String.class) : null;

                String picture =
                        resultSet.getObject("Picture") != null ?
                                resultSet.getObject("Picture").toString() : null;

                Category category = new Category(categoryId, categoryName, description, picture);
                categories.add(category);
            }
            connection.close();
            return categories;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
