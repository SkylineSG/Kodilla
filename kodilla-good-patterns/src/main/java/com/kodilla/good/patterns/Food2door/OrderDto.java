package com.kodilla.good.patterns.Food2door;

import java.util.Map;

public class OrderDto {
    public Customer customer;
    public Product product;
    public Supplier supplier;
    public boolean isOrdered;

    public OrderDto(Customer customer, Product product, Supplier supplier, boolean isOrdered) {
        this.customer = customer;
        this.product = product;
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}