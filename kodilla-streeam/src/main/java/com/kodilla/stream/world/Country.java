package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class Country {

    private final String countryName;
    private final BigInteger people;

    public Country(String countryName, BigInteger people) {
        this.countryName = countryName;
        this.people = people;
    }
    public String getCountryName() {
        return countryName;
    }

    public BigInteger getPeople() {
        return people;
    }

    Country Poland = new Country("Poland",3745678);
    Country Germany = new Country("Germany",8563456);
    Country Denmark = new Country("Denmark", 2234545);
    Country France = new Country("France",6745379);

    Country Brasil = new Country("Brasil",12234545);
    Country Argentina = new Country("Argentina",2234545);
    Country Panama = new Country("Panama",234545);
    Country Columbia = new Country("Columbia",134545);

     final List<Country> europe = new ArrayList<>();
     final List<Country> southAmerica = new ArrayList<>();

    public void addCountryToEurope(Country country) {
        europe.add(country.France);
        europe.add(country.Poland);
        europe.add(country.Denmark);
        europe.add(country.Germany);
    }
    public void addCountryToSouthAmerica(Country country) {
    southAmerica.add(Brasil);
    southAmerica.add(Argentina);
    southAmerica.add(Panama);
    southAmerica.add(Columbia);
    }

    public BigInteger getPeopleQuantity(){
        BigInteger peopleQuantity = people;
        return peopleQuantity;
    }

    public List<Country> getEurope() {
        return europe;
    }

    public List<Country> getSouthAmerica() {
        return southAmerica;
    }
}
