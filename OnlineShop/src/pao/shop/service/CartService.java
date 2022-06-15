package pao.shop.service;

import pao.shop.entity.order.CartProduct;

public class CartService {

    private static AuditLog log = new AuditLog();

    public void addToCart(CartProduct product, Integer cartCode) {
        log.logAction("addToCart" );
    }

    public void removeFromCart(CartProduct product, Integer cartCode) {

    }

    public void updateProductQuantity(CartProduct product, Integer quantity) {

    }

    public void increaseProductQuantity(CartProduct product) {

    }

    public void decreaseProductQuantity(CartProduct product) {

    }

}
