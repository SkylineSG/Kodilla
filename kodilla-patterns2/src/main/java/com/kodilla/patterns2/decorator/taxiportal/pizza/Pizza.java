package com.kodilla.patterns2.decorator.taxiportal.pizza;


import java.math.BigDecimal;

public interface Pizza {
    BigDecimal getCost();
    String getDescription();
}