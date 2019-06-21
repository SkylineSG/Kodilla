package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countries = new ArrayList<>();

    public void addCountry(Country country) {
        countries.add(country);
    }


/*
    private final String land;
    private final Country country;

    public Continent(String land, Country country) {
        this.land = land;
        this.country = country;
    }

    public String getLand() {
        return land;
    }

    public Country getCountry() {
        return country;
    }

    public List<Country> getCountries() {
        return countries;
    }
*/



}
