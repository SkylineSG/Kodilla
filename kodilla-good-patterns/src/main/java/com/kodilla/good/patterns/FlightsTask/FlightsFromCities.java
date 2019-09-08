package com.kodilla.good.patterns.FlightsTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class FlightsFromCities {

    public static List<Flights> getList() {
        List<Flights> flightsList = new ArrayList<>();

        FlightFrom flightFrom1 = new FlightFrom("Warsaw",1);
        FlightFrom flightFrom2 = new FlightFrom("Praha",2);
        FlightFrom flightFrom3 = new FlightFrom("Roma",3);
        FlightFrom flightFrom4 = new FlightFrom("Paris",4);
        FlightFrom flightFrom5 = new FlightFrom("London",5);


        DirectFlightTo directFlightTo1 = new DirectFlightTo("Berlin",1);
        DirectFlightTo directFlightTo2 = new DirectFlightTo("Athens",2);
        DirectFlightTo directFlightTo3 = new DirectFlightTo("Lublana",3);
        DirectFlightTo directFlightTo4 = new DirectFlightTo("Oslo",4);
        DirectFlightTo directFlightTo5 = new DirectFlightTo("Helsinki",5);
        DirectFlightTo directFlightTo6 = new DirectFlightTo("Amsterdam",6);
        DirectFlightTo directFlightTo7 = new DirectFlightTo("Kair",6);
        DirectFlightTo directFlightTo8 = new DirectFlightTo("Vienna",7);
        DirectFlightTo directFlightTo9 = new DirectFlightTo("Bratislava",9);

        flightsList.add(new Flights(flightFrom1, directFlightTo1));
        flightsList.add(new Flights(flightFrom1, directFlightTo2));
        flightsList.add(new Flights(flightFrom1, directFlightTo6));
        flightsList.add(new Flights(flightFrom2, directFlightTo3));
        flightsList.add(new Flights(flightFrom2, directFlightTo7));
        flightsList.add(new Flights(flightFrom3, directFlightTo9));
        flightsList.add(new Flights(flightFrom3, directFlightTo8));
        flightsList.add(new Flights(flightFrom3, directFlightTo6));
        flightsList.add(new Flights(flightFrom4, directFlightTo2));
        flightsList.add(new Flights(flightFrom4, directFlightTo5));
        flightsList.add(new Flights(flightFrom4, directFlightTo7));
        flightsList.add(new Flights(flightFrom5, directFlightTo1));
        flightsList.add(new Flights(flightFrom5, directFlightTo9));
        flightsList.add(new Flights(flightFrom5, directFlightTo5));
        flightsList.add(new Flights(flightFrom5, directFlightTo7));
        flightsList.add(new Flights(flightFrom1,directFlightTo4));

        return flightsList;

    }
}
