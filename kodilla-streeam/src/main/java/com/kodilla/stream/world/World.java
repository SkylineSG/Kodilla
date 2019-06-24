package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final String name;
    private final List<Continent> continents;


    public World(String name, List<Continent> continents) {
        this.name = name;
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity(){
           return continents.stream()
           .flatMap(continent -> continent.getCoutyLists().stream())
                   .map(d -> d.getPeople())
                   .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
