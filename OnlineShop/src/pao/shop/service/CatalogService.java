package pao.shop.service;

import pao.shop.entity.catalog.Category;
import pao.shop.entity.catalog.Product;
import pao.shop.dao.file.CategoryFileRepository;
//import pao.shop.service.AuditLog;
import java.io.IOException;
import java.util.List;

public class CatalogService {

    private static final  AuditLog log = new AuditLog();

    public List<Category> getCategoryList() throws IOException {
        log.logAction("getCategoryList");
        CategoryFileRepository scs = CategoryFileRepository.getInstance();
        List<Category> lista = scs.readFromFile();
       /* for (Category c: lista) {
            System.out.println(c);
        }*/
        return lista;
    }

    public List<Product> getProductFromCategory(Integer categoryCode) {
        log.logAction("getProductFromCategory");
        return null;
    }

}
