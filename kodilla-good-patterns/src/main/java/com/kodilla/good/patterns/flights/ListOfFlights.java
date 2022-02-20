package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class ListOfFlights {
    Set<Flight> listOfFlights = new HashSet();

    public void getListOfFlights(Set<Flight> listOfFlights){

        listOfFlights.stream()
                .map(f-> f.toString())
                .forEach(System.out::println);
    }
}
