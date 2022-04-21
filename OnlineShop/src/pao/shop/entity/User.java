package pao.shop.entity;

import pao.shop.entity.cart.Cart;

public class User {

    private String fullName;
    private Integer userId;
    private String email;
    private String address;
    private String phoneNumber;
    private Cart cart;

    public User(String fullName, Integer userId, String email, String address, String phoneNumber, Cart cart) {
        this.fullName = fullName;
        this.userId = userId;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cart = cart;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
