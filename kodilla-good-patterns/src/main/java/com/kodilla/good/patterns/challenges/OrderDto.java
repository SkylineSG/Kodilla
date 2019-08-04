package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public User user;
    public boolean isAllowed;
    public Product product;

    public OrderDto( User user, Product product, boolean isAllowed){
        this.isAllowed=isAllowed;
        this.user=user;
        this.product=product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isAllowed() {
        return isAllowed;
    }
}
