package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductPhone implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product, LocalDateTime datePurchase) {
        return true;
    }
}
