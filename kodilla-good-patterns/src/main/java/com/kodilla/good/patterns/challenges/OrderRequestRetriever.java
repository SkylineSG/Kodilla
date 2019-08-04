package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Paweł","Pawłoski");
        Product phone = new Product("Samsung",199.99);
        LocalDateTime datePurchase = LocalDateTime.of(2019,07,25,17,00,00);

        return new OrderRequest(user,phone,datePurchase);
    }
}
