package pao.shop.dao.repository;

import pao.shop.dao.configuration.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductSizeRepository {
    private static ProductSizeRepository productSizeRepository;
    private ProductSizeRepository(){}

    public static ProductSizeRepository getProductSizeRepository(){
        if (productSizeRepository ==  null){
            productSizeRepository = new ProductSizeRepository();
        }
        return productSizeRepository;
    }

    public void createTable(){
        String createTable = "CREATE TABLE IF NOT EXISTS product_size" +
                "(productId INT REFERENCES product(id)," +
                "sizeId INT REFERENCES size(id)," +
                "PRIMARY KEY (productId, sizeId)" +
                ")";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement statement = connection.createStatement();
            statement.execute(createTable);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
