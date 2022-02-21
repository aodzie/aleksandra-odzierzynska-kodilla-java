package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final HashSet<Continent> continents = new HashSet<>();

    public void addContinent (Continent continent){
        continents.add(continent);
    }
    public Set<Continent> getContinentList() {
        return continents;
    }
    public BigDecimal getPopulation(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPopulationQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}