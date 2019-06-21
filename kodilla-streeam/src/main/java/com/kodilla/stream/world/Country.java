package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class Country {

    private final String countryName;
    private final BigDecimal people;

    public Country(String countryName, BigDecimal people) {
        this.countryName = countryName;
        this.people = people;
    }
    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeople() {
        return people;
    }

    public BigInteger getPeopleQuantity(){
        BigInteger peopleQuantity = new BigInteger("3774856");
        return peopleQuantity;
    }
}
