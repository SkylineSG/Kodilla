package com.kodilla.good.patterns.Food2door;

import java.util.Map;

public interface FoodProducer {
    void process(Customer customer, Map<Product, Integer> orderedProducts);
}
