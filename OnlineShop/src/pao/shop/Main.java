package pao.shop;

import pao.shop.dao.configuration.DatabaseConfiguration;
import pao.shop.dao.repository.CategoryRepository;
import pao.shop.dao.repository.ProductRepository;
import pao.shop.dao.repository.ProductSizeRepository;
import pao.shop.dao.repository.SizeRepository;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) throws IOException {
//        try {
//            ResultSet rs = DatabaseConfiguration.getDatabaseConnection().createStatement().executeQuery("select count(1) from mancare");
//            while (rs.next()){
//                System.out.println("nr rezultate din tabela mancare:" + rs.getInt(1));
//            }
//
//        }catch (Exception e){
//            System.out.println("nu merge rs");
//            e.printStackTrace();
//        }

        DatabaseConfiguration dbc = new DatabaseConfiguration();

        CategoryRepository.getCategoryRepository().createTable();
        ProductRepository.getProductRepository().createTable();
        SizeRepository.getSizeRepository().createTable();
        ProductSizeRepository.getProductSizeRepository().createTable();
    }

}
