package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String land;
    private final List<Country> coutyLists;

    public Continent(String land, List<Country> coutyLists) {
        this.land = land;
        this.coutyLists = coutyLists;
    }

    public String getLand() {
        return land;
    }

    public List<Country> getCoutyLists() {
        return coutyLists;
    }
}
