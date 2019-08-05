package com.kodilla.good.patterns.Food2door;

import java.util.HashMap;
import java.util.Map;

public class FoodShop implements Supplier {

public boolean process(OrderRequest orderRequest){
    System.out.println((orderRequest.getCustomer() + "Zamówienie na: " + orderRequest.getProduct() + " w FoodShop"));
    return true;
    }
 }