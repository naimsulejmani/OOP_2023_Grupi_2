package db_project.repositories;


import db_project.helpers.DbHelper;
import db_project.infrastructures.CrudRepository;
import db_project.models.Category;
import interfaces.db_project.interfaces.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public final class CategoryRepository implements CrudRepository<Category, Integer> {
    @Override
    public Category convert(ResultSet resultSet) throws SQLException {
        int categoryId = resultSet.getInt("CategoryID");
        String categoryName = resultSet.getString("CategoryName");

        String description = null;
        if (resultSet.getObject("Description") != null)
            description = resultSet.getString("Description");

        byte[] picture = null;
        if (resultSet.getObject("Picture") != null)
            picture = (byte[]) resultSet.getObject("Picture");

        return new Category(categoryId, categoryName, description, picture);
    }

    @Override
    public Category findById(Integer id) {
        String query = "SELECT * FROM dbo.Categories WHERE CategoryID = ?";
        try (Connection connection = DbHelper.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            Category category = null;

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                category = convert(resultSet);
            }
            return category;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Category> findAll() {
        String query = "SELECT * FROM dbo.Categories";
        try (Connection connection = DbHelper.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            List<Category> categories = new ArrayList<>();

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                var category = convert(resultSet);
                categories.add(category);
            }
            return categories;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add(Category model) {

    }

    @Override
    public void modify(Integer id, Category model) {

    }

    @Override
    public void remove(Integer id) {

    }
}
