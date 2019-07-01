package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteNotFoundException extends Exception {

    public static void main(String[] args) {
        Map<Flight,Boolean> tmpMap = new HashMap<>();

        FindFlight findFlight = new FindFlight();

        Flight flight1 = new Flight("Szczecin", "Wrocław");
        Flight flight2 = new Flight("berlin", "Warsaw");
        Flight flight3 = new Flight("Gdańsk", "Kraków");
        Flight flight4 = new Flight("Lublin", "Olsztyn");

        tmpMap.put(flight1, true);
        tmpMap.put(flight2, true);
        tmpMap.put(flight3, false);

        findFlight.addToMap(tmpMap);


        try{
            findFlight.findFilght(flight1);
        }catch (Exception e){
            System.out.println("Error Occured");
        }finally {
            System.out.println("This is the end of task");
        }


        try{
            findFlight.findFilght(flight4);
        }catch (Exception e){
            System.out.println("Error Occured");
        }finally {
            System.out.println("This is the end of task");
        }
    }


}
