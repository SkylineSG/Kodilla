package com.kodilla.kodilla.patterns.strategy;

import com.kodilla.kodilla.patterns.strategy.predictors.ConservativePredictor;

public class IndividualCustomer extends Customer {
    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}