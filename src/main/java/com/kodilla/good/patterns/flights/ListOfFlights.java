package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListOfFlights {
    Set<Flight> listOfFlights = new HashSet();

    public void getListOfFlights(Set<Flight> listOfFlights){

        listOfFlights.stream()
                .map(f-> f.toString())
                .forEach(System.out::println);
    }
}
