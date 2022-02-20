package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsRunner {
    public static void main(String[] args) {
        Set<Flight> listOfFlights = new HashSet();
        String exampleDestination = "WAW";
        String exampleDeparture = "WAW";
        String city1 = "KRK";
        String city2 = "WRO";

        listOfFlights.add(new Flight("KRK", "WAW"));
        listOfFlights.add(new Flight("WAW", "KRK"));
        listOfFlights.add(new Flight("WRO", "WAW"));
        listOfFlights.add(new Flight("WAW", "WRO"));

        System.out.println("Lista wszystkich lotow: ");
        ListOfFlights list = new ListOfFlights();
        list.getListOfFlights(listOfFlights);

        FlightsFinder finder = new FlightsFinder();
        System.out.println("Wyszukaj wszystkie loty do: " + exampleDestination);
        finder.findAllFlightsFrom(listOfFlights, exampleDestination);

        System.out.println("Wyszukaj wszystkie loty z: " + exampleDeparture);
        finder.findAllFlightsTo(listOfFlights, exampleDeparture);

        System.out.println("Wyszukaj loty z " +city1 +" do " + city2 + ": ");
        finder.findAllConnections(listOfFlights, city1, city2);

    }
}
