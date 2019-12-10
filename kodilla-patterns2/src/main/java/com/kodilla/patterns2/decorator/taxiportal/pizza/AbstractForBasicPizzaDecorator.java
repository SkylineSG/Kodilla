package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public abstract class AbstractForBasicPizzaDecorator implements Pizza{

    private final Pizza pizza;

    public AbstractForBasicPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getCost(){
        return pizza.getCost();
    }

    @Override
    public String getDescription(){
        return pizza.getDescription();
    }
}