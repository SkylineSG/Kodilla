package com.kodilla.good.patterns.Food2door;

public class Customer {
    private String name;
    private String surname;

    public Customer(String name,String surname) {
        this.name = name;
        this.surname = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
