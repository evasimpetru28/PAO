package pao.shop.entity.order;

import pao.shop.entity.catalog.Product;

public class OrderProduct {

    private Integer productQuantity = 1;
    private Product product;
    private Double price;

    public OrderProduct(Integer productQuantity, Product product, Double price) {
        this.productQuantity = productQuantity;
        this.product = product;
        this.price = price;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "productQuantity=" + productQuantity +
                ", product=" + product +
                ", price=" + price +
                '}';
    }
}
