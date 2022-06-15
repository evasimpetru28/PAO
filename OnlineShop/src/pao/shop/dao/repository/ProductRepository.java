package pao.shop.dao.repository;

import pao.shop.dao.configuration.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductRepository {
    private static ProductRepository productRepository;
    private ProductRepository(){};

    public static ProductRepository getProductRepository(){
        if (productRepository == null){
            productRepository = new ProductRepository();
        }
        return productRepository;
    }

    public void createTable(){
        String createTable = "CREATE TABLE IF NOT EXISTS product" +
                "(id SERIAL PRIMARY KEY," +
                "productName VARCHAR(25) NOT NULL," +
                "productPrice NUMERIC(3,2) NOT NULL," +
                "color VARCHAR(10)," +
                "productDescription VARCHAR(250)," +
                "categoryId INT REFERENCES category(id) NOT NULL" +
                ");";
        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement statement = connection.createStatement();
            statement.execute(createTable);
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
