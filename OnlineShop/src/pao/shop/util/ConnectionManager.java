package pao.shop.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectionManager {

    //private static final String DATABASE_URL="";
    private static  String CONNECTION_STRING;
    private static  String user;
    private static  String pass;
    private static ConnectionManager connectionManager;

    private ConnectionManager(){

    }

    /*public static ConnectionManager getInstance(){
        if(connectionManager==null){
            connectionManager = new ConnectionManager();
        }
        return connectionManager;
    }
*/

    private static void readProperties() {

        try {
            InputStream input =
                    new FileInputStream("application.properties");
            Properties properties = new Properties();
            properties.load(input);
            CONNECTION_STRING = properties.getProperty("CONNECTION_STRING", "jdbc:postgresql://localhost:5432/exemplu");
            user = properties.getProperty("USER", "eva");
            pass = properties.getProperty("PASS","mypasshere");
        }catch (IOException e){

            System.out.println(e.getMessage());
            e.printStackTrace();

        }

    }

    public static Connection getDatabaseConnection(){
        readProperties();
        Connection con = null;
        try {
            con = DriverManager.getConnection(CONNECTION_STRING, user, pass);
        }catch (SQLException e){
            System.out.println("nu reuseste conexiunea");
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static List<Object> executeQuery(String sql) {
        Connection con = getDatabaseConnection();
        Statement stmt = null;
        List<Object> result = new ArrayList<>();
        try{
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                // adauga rs la result (linia de introdus in lista de obiecte)
                // result.add(rowMapper.mapRow(rs));
            }

            rs.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }

        return result;

    }


}
