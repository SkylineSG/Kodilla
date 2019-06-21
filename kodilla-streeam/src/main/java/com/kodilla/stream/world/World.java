package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();

    public void addContinents(Continent continent) {
        continents.add(continent);
    }

    public BigInteger getPeopleQuantity(){
        BigInteger peopleQuantity = new BigInteger("99999999901234567890");
        return peopleQuantity;
    }
}
