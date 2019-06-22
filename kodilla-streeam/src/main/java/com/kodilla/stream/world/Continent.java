package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String land;
    private final Country country;

    public Continent(String land, Country country) {
        this.land = land;
        this.country = country;
    }

    public String getContinentName() {
        return land;
    }

    public Country getCountry() {
        return country;
    }

    Continent Europe = new Continent("Europe",country.europe);
    Continent southAmerica = new Continent("southAmerica",country.southAmerica);


}
