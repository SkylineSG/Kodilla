package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class GarlicSauceDecorator extends AbstractForBasicPizzaDecorator{

    public GarlicSauceDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Garlic";
    }
}