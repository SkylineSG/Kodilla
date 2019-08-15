package com.kodilla.kodilla.patterns.strategy;

import com.kodilla.kodilla.patterns.strategy.predictors.BalancedPredictor;

public class CorporateCustomer extends Customer {
   BuyPredictor buyPredictor;
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }


}