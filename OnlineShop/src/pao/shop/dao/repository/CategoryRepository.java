package pao.shop.dao.repository;

import pao.shop.dao.configuration.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CategoryRepository {
    private static CategoryRepository categoryRepository;
    private CategoryRepository(){}
    public static CategoryRepository getCategoryRepository(){
        if (categoryRepository == null){
            categoryRepository = new CategoryRepository();
        }
        return categoryRepository;
    }

    public void createTable(){
        String createTable = "CREATE TABLE IF NOT EXISTS category" +
                "(id SERIAL PRIMARY KEY, categoryName VARCHAR(250) NOT NULL);";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement statement = connection.createStatement();
            statement.execute(createTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
