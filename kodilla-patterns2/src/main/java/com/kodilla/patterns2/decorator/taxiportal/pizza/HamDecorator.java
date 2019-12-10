package com.kodilla.patterns2.decorator.taxiportal.pizza;


import java.math.BigDecimal;

public class HamDecorator extends AbstractForBasicPizzaDecorator {

    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Ham";
    }
}