package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {
    private String departurePlace;
    private String destinationPlace;

    public Flight(String departurePlace, String destinationPlace) {
        this.departurePlace = departurePlace;
        this.destinationPlace = destinationPlace;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return departurePlace.equals(flight.departurePlace) && destinationPlace.equals(flight.destinationPlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departurePlace, destinationPlace);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departurePlace='" + departurePlace + '\'' +
                ", destinationPlace='" + destinationPlace + '\'' +
                '}';
    }
}
