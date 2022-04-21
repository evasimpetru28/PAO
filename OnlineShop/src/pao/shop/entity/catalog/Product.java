package pao.shop.entity.catalog;

public class Product {

    private String productName;
    private int productCode;
    private float productPrice;
    private boolean inStock;
    private Color color;
    private Size size;
    private String productDescription;
    private int categoryCode;

    public Product(String productName, int productCode, float productPrice, boolean inStock, Color color, Size size, String productDescription, int categoryCode) {
        this.productName = productName;
        this.productCode = productCode;
        this.productPrice = productPrice;
        this.inStock = inStock;
        this.color = color;
        this.size = size;
        this.productDescription = productDescription;
        this.categoryCode = categoryCode;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }
}
