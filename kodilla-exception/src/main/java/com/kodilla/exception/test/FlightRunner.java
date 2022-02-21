package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightRunner {
    public void findFilght(Flight flight) throws RouteNotFoundException{
        Map <String, Boolean>flightsMap = new HashMap<>();

        flightsMap.put("airport1", true);
        flightsMap.put("airport2", false);

        if(!flightsMap.containsKey(flight.getArrivalAirport())
                ||!flightsMap.containsKey(flight.getDepartureAirport())){
            throw new RouteNotFoundException("Airport is not on the map");
        }

    }

    public static void main(String[] args) {
        FlightRunner flightRunner = new FlightRunner();

        try{
            flightRunner.findFilght(new Flight("airport1", "airport3"));
        }catch(RouteNotFoundException exc){
            System.out.println("No route!");
        } finally{
            System.out.println("End of search");
        }
    }
}
