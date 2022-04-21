package pao.shop.entity.cart;

import pao.shop.entity.order.OrderProduct;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<OrderProduct> products = new ArrayList<>();
    private Integer cartCode;

    public Cart(List<OrderProduct> products, Integer cartCode) {
        this.products = products;
        this.cartCode = cartCode;
    }

    public Integer getCartCode() {
        return cartCode;
    }

    public void setCartCode(Integer cartCode) {
        this.cartCode = cartCode;
    }

    public List<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProduct> products) {
        this.products = products;
    }
}
