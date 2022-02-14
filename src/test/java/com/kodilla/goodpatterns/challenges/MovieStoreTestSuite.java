package com.kodilla.goodpatterns.challenges;

import com.kodilla.good.patterns.challenges.MovieStore;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieStoreTestSuite{
    @Test
    void testMovieStoreStream(){
        //Given
        MovieStore movieStore = new MovieStore();
        String movieNames = "Żelazny Człowiek ! Iron Man ! Mściciele ! Avengers ! Błyskawica ! Flash";
        //When
        String movies = movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining(" ! "));
        //Then
       assertEquals(movieNames, movies);

    }

}
