package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    private Boolean flightExist;
    private Map<Flight,Boolean> airFieldName = new HashMap<>();

    public void addToMap(Map<Flight,Boolean> tmpNewMap){
        airFieldName.putAll(tmpNewMap);
    }

    public Boolean findFilght(Flight flight) throws Exception{

        if (airFieldName.get(flight)){
            flightExist = true;
        }else {
            flightExist = false;
            throw new Exception();
        }

        return flightExist;
    }
}