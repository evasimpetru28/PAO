package pao.shop.entity.catalog;

public class Product {
    private Integer id;
    private String productName;
    private Double productPrice;
    private String color;
    private String productDescription;
    private Integer categoryId;
    private Double price;


    public Product(Integer id, String productName, Double productPrice, String color, String productDescription, Double price, Integer categoryId) {
        this.productName = productName;
        this.id = id;
        this.productPrice = productPrice;
        this.color = color;
        this.productDescription = productDescription;
        this.price = price;
        this.categoryId = categoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", color='" + color + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", categoryId=" + categoryId +
                ", price=" + price +
                '}';
    }
}
