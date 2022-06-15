package pao.shop.entity.catalog;

public class Product {
    private int id;
    private String productName;
    private float productPrice;
    private String color;
    private String size;
    private String productDescription;
    private int categoryId;

    public Product(String productName, int productCode, float productPrice, String color, String size, String productDescription, int categoryCode) {
        this.productName = productName;
        this.id = productCode;
        this.productPrice = productPrice;
        this.color = color;
        this.size = size;
        this.productDescription = productDescription;
        this.categoryId = categoryCode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCode=" + id +
                ", productPrice=" + productPrice +
                ", color=" + color +
                ", size=" + size +
                ", productDescription='" + productDescription + '\'' +
                ", categoryCode=" + categoryId +
                '}';
    }
}
