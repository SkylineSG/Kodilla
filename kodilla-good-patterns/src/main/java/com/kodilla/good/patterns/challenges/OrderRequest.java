package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime datePurchase;
    private Product product;

    public OrderRequest(final User user,final Product product,final LocalDateTime datePurchase) {
        this.user = user;
        this.datePurchase = datePurchase;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDatePurchase() {
        return datePurchase;
    }
}


