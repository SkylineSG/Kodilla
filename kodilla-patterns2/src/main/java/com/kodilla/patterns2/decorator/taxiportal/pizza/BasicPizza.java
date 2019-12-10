package com.kodilla.patterns2.decorator.taxiportal.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Pizza{



    @Override
    public BigDecimal getCost(){
        return new BigDecimal(10);
    }

    @Override
    public String getDescription(){
        return "Pizza with : ";
    }
}