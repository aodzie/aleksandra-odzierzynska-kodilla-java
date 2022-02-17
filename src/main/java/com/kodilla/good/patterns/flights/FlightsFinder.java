package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightsFinder {
    public void findAllFlightsFrom(Set<Flight>listOfFlights, String destination){
        listOfFlights.stream().filter(f->f.getDestinationPlace().equals(destination)).forEach(System.out::println);
    }
    public void findAllFlightsTo(Set<Flight>listOfFlights, String departure){
        listOfFlights.stream().filter(f->f.getDeparturePlace().equals(departure)).forEach(System.out::println);
    }
    public void findAllConnections (Set<Flight>listOfFlights, String departure, String destination){
        listOfFlights.stream().filter(f->f.getDeparturePlace().equals(departure)).forEach(System.out::println);
        listOfFlights.stream().filter(f->f.getDestinationPlace().equals(destination)).forEach(System.out::println);
    }
}