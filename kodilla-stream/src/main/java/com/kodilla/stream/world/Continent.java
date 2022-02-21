package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final HashSet<Country> listOfCountries = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry (Country country){
        listOfCountries.add(country);
    }

    public Set<Country> getCountries() {
        return listOfCountries;
    }
}