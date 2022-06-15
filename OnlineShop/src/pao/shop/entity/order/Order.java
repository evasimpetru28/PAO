package pao.shop.entity.order;

import pao.shop.entity.cart.Cart;
import pao.shop.entity.User;

import java.util.Date;
import java.util.List;

public class Order extends Cart {

    private Date orderDate;
    private Integer orderCode;
    private User customer;
    private OrderStatus status;

    public Order(List<OrderProduct> products, Integer cartCode, Date orderDate, Integer orderCode, User customer, OrderStatus status) {
        super(products, cartCode);
        this.orderDate = orderDate;
        this.orderCode = orderCode;
        this.customer = customer;
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
