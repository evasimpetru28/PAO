package pao.shop;

import pao.shop.entity.catalog.Category;
import pao.shop.repo.file.CategoryRepository;
import pao.shop.service.CatalogService;
import pao.shop.util.ConnectionManager;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println();


        try {
            ResultSet rs = ConnectionManager.getDatabaseConnection().createStatement().executeQuery("select count(1) from mancare");
            while (rs.next()){
                System.out.println("nr rezultate din tabela mancare:" + rs.getInt(1));
            }

        }catch (Exception e){
            System.out.println("nu merge rs");
            e.printStackTrace();
        }


    }

}
