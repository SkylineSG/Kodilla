package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService  {

    boolean order(User user, LocalDateTime datePurchase, Product product);
}
