package pao.shop.entity.order;

public class CartProduct {

    private Integer id;
    private Integer productId;
    private Integer userId;
    private Integer productQuantity = 1;

    public CartProduct(Integer id, Integer productId, Integer userId, Integer productQuantity) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.productQuantity = productQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "id=" + id +
                ", productId=" + productId +
                ", userId=" + userId +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
