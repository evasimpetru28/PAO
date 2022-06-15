package pao.shop.dao;

import pao.shop.util.ConnectionManager;

import java.sql.Connection;

public class CategoryManager {
    Connection con;

    public CategoryManager() {
        con= ConnectionManager.getDatabaseConnection();
    }


}
