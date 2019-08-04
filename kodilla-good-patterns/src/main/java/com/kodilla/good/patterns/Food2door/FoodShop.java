package com.kodilla.good.patterns.Food2door;

import java.util.HashMap;
import java.util.Map;

public class FoodShop implements FoodProducer {
    private Map<Product, Integer> productAvailabilityList;

    public FoodShop() {
        productAvailabilityList = createProductList();
    }

    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new Product("Bread", 2.50), 10);
        productsList.put(new Product("cORN", 3.20), 25);
        productsList.put(new Product("Ham", 3.10), 22);
        productsList.put(new Product("Butter", 6), 34);

        return productsList;
    }

    @Override
    public void process(Customer customer, Map<Product, Integer> orderedProducts) {

    }
}