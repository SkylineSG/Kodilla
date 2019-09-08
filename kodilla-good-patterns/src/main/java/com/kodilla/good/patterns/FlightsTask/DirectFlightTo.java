package com.kodilla.good.patterns.FlightsTask;

import java.util.Objects;

public class DirectFlightTo {

    private String directCityFlightTo;
    private int numberOfCityFlightTo;

    public DirectFlightTo(String directCityFlightTo, int numberOfCityFlightTo) {
        this.directCityFlightTo = directCityFlightTo;
        this.numberOfCityFlightTo = numberOfCityFlightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectFlightTo that = (DirectFlightTo) o;
        return numberOfCityFlightTo == that.numberOfCityFlightTo &&
                directCityFlightTo.equals(that.directCityFlightTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfCityFlightTo);
    }

    @Override
    public String toString() {
        return "Bezpośrednie loty do:" + directCityFlightTo + '\'' +
                '}';
    }

    public String getDirectCityFlightTo() {
        return directCityFlightTo;
    }
}