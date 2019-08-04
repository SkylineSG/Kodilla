package com.kodilla.good.patterns.Food2door;

import java.util.Map;

public class OrderRequest {
    private Customer customer;
    private FoodProducer foodProducer;
    private Map<Product, Integer> orderedProducts;

    public OrderRequest(Customer customer, FoodProducer foodProducer, Map<Product, Integer> orderedProducts) {
        this.customer = customer;
        this.foodProducer = foodProducer;
        this.orderedProducts = orderedProducts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public Map<Product, Integer> getOrderedProducts() {
        return orderedProducts;
    }
}
