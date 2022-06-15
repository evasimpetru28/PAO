package pao.shop.dao.repository;

import pao.shop.dao.configuration.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SizeRepository {

    private static SizeRepository sizeRepository;
    private SizeRepository(){}
    public static SizeRepository getSizeRepository(){
        if (sizeRepository == null){
            sizeRepository = new SizeRepository();
        }
        return sizeRepository;
    }

    public void createTable(){
        String createTable = "CREATE TABLE IF NOT EXISTS SIZE" +
                "(id SERIAL PRIMARY KEY," +
                "sizeCH VARCHAR(2) NOT NULL," +
                "sizeNO NUMERIC(2) NOT NULL" +
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
