package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[]numberslist = {5, 0, 10, 8, 3, 2, 1, 1, 10, 1, 0, 1, 2, 1, 1, 4, 1, 1, 0, 5};
        //When
        ArrayOperations.getAverage(numberslist);
        //Then
        assertEquals(2.85, ArrayOperations.getAverage(numberslist).getAsDouble());
    }
}
