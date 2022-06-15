package pao.shop.entity.order;

public class OrderedProduct {

    private Integer oderId;
    private Integer cartProductId;

    public OrderedProduct(Integer oderId, Integer cartProductId) {
        this.oderId = oderId;
        this.cartProductId = cartProductId;
    }

    public Integer getOderId() {
        return oderId;
    }

    public void setOderId(Integer oderId) {
        this.oderId = oderId;
    }

    public Integer getCartProductId() {
        return cartProductId;
    }

    public void setCartProductId(Integer cartProductId) {
        this.cartProductId = cartProductId;
    }

    @Override
    public String toString() {
        return "OrderedProduct{" +
                "oderId=" + oderId +
                ", cartProductId=" + cartProductId +
                '}';
    }
}
