package com.kodilla.good.patterns.Food2door;

import java.util.Map;

public class OrderRequest {
    private Customer customer;
    private Product product;
    private Supplier supplier ;

    public OrderRequest(Customer customer, Product product, Supplier supplier) {
        this.customer = customer;
        this.product = product;
        this.supplier = supplier;
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
}
