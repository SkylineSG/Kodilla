package com.kodilla.good.patterns.Food2door;

public class GlutenFreeShop implements Supplier {

    @Override
    public boolean process(OrderRequest orderRequest){
        System.out.println(orderRequest.getCustomer() + "Zamówienie na: " + orderRequest.getProduct() + " w GlutenShop");
        return true;

    }
}
