package pao.shop.entity.order;

import java.util.Date;

public class Order {
    private Integer id;
    private Date orderDate;
    private String status;

    public Order(Integer id, Date orderDate, String status) {
        this.orderDate = orderDate;
        this.id = id;
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String  getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", id=" + id +
                ", orderDate=" + orderDate +
                ", status=" + status +
                '}';
    }
}
