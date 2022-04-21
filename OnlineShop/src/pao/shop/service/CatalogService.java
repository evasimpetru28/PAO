package pao.shop.service;

import pao.shop.entity.catalog.Category;
import pao.shop.entity.catalog.Product;
//import pao.shop.service.AuditLog;
import java.util.ArrayList;
import java.util.List;

public class CatalogService {

    private static final  AuditLog log = new AuditLog();

    public List<Category> getCategoryList() {
        log.logAction("getCategoryList");
        return null;
    }

    public List<Product> getProductFromCategory(Integer categoryCode) {
        log.logAction("getProductFromCategory");
        return null;
    }

}
