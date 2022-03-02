package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CollectionTestSuite {
    CollectionTestSuite() {
    }

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("testOddNumbersExterminatorEmptyList")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        List<Integer> numbers = new ArrayList();
        List<Integer> emptyList = new ArrayList();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("testOddNumbersExterminatorNormalList")
    @Test
    void testOddNumbersExterminatorNormalList() {
        List<Integer> numbers = new ArrayList();
        List<Integer> oddNumbers = new ArrayList();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(20);
        oddNumbers.add(2);
        oddNumbers.add(20);
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        Assertions.assertEquals(oddNumbers, result);
    }
}