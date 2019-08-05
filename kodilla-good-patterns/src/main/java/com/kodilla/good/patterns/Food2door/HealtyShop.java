package com.kodilla.good.patterns.Food2door;

public class HealtyShop implements Supplier {

    public boolean process(OrderRequest orderRequest){
      System.out.println(orderRequest.getCustomer() + "Zamówienie na: " + orderRequest.getProduct() + " w FoodShop");
        return true;
    }
    }

