package pao.shop.service;

import pao.shop.entity.order.OrderProduct;

public class CartService {

    private static AuditLog log = new AuditLog();

    public void addToCart(OrderProduct product, Integer cartCode) {
        log.logAction("addToCart" );
    }

    public void removeFromCart(OrderProduct product, Integer cartCode) {

    }

    public void updateProductQuantity(OrderProduct product, Integer quantity) {

    }

    public void increaseProductQuantity(OrderProduct product) {

    }

    public void decreaseProductQuantity(OrderProduct product) {

    }

}
