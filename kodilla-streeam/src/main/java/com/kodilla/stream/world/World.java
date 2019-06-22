package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final Country country;
    private final Continent continent;

    public World(Country country, Continent continent) {
        this.country = country;
        this.continent = continent;
    }

    private final List<Continent> continents = new ArrayList<>();

    public void addContinents(Continent continent) {
        continents.add(continent);
    }

    public BigInteger getPeopleQuantity(){
        BigInteger peopleQuantity = new BigInteger();
        return peopleQuantity;
    }
}
