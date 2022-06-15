package pao.shop.dao.repository;

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
                "inStock BOOLEAN," +
                "color VARCHAR(10)," +
                "productDescription VARCHAR(250)," +
                "categoryId INT," +
                "   CONSTRAINT fk_categoryId" +
                "       FOREIGN KEY(categoryId)" +
                "           REFERENCES category(id)" +
                ");";
        // ADAUGA LA STRING ^ FOREIGN KEY PENTRU SIZE
    }
}
