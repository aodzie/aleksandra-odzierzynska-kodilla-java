package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent southAmerica = new Continent("South America");

        Country poland = new Country("Poland", BigDecimal.valueOf(37950000));
        Country spain = new Country("Spain", BigDecimal.valueOf(47350000));
        Country southAfrica = new Country("South Africa", BigDecimal.valueOf(59310000));
        Country columbia = new Country("Columbia", BigDecimal.valueOf(50880000));

        //When
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(southAmerica);

        europe.addCountry(poland);
        europe.addCountry(spain);
        africa.addCountry(southAfrica);
        southAmerica.addCountry(columbia);

        //Then
        assertEquals(2, europe.getCountries().size());
        assertEquals(1, africa.getCountries().size());
        assertEquals(BigDecimal.valueOf(37950000+47350000+59310000+50880000), world.getPopulation());

    }
}
