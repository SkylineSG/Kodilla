package com.kodilla.good.patterns.Food2door;

public class OrderRequestRetriever {

    public OrderRequest retrive1() {
        Customer customer1 = new Customer("Tom","Tomas");
        Product product1 = new Product("Bread",2.50);
        Supplier supplier1 = new FoodShop();
        return new OrderRequest(customer1,product1,supplier1);
    }
    public OrderRequest retrive2() {
        Customer customer2 = new Customer("John","Tomas");
        Product product2 = new Product("Jam",6.20);
        Supplier supplier2 = new GlutenFreeShop();
        return new OrderRequest(customer2,product2,supplier2);
    }
    public OrderRequest retrive3() {
        Customer customer3 = new Customer("Tom","Wsd");
        Product product3 = new Product("Bread",6.50);
        Supplier supplier3 = new HealtyShop();
        return new OrderRequest(customer3,product3,supplier3);
    }

}
