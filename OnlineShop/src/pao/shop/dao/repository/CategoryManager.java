package pao.shop.dao.repository;

import pao.shop.dao.configuration.DatabaseConfiguration;

import java.sql.Connection;

public class CategoryManager {
    Connection con;

    public CategoryManager() {
        con= DatabaseConfiguration.getDatabaseConnection();
    }


}
