package com.kodilla.good.patterns.Food2door;

import java.util.Map;

public class OrderDto {
    public Customer customer;
    public Map<Product, Integer> orderedProducts;
    public boolean isOrdered;

    public OrderDto(Customer customer, Map<Product, Integer> orderedProducts, boolean isOrdered) {
        this.customer = customer;
        this.orderedProducts = orderedProducts;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getOrderedProducts() {
        return orderedProducts;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
