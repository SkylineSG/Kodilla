package com.kodilla.good.patterns.FlightsTask;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        FlightsFromCities.getList()
                .stream()
                .filter(e -> e.getFlightFrom().getCityFlightFrom().equals("Warsaw"))
                .map(directFlightTo -> directFlightTo.getDirectFlightTo().getDirectCityFlightTo())
                .forEach(System.out::println);
    }
}