package com.kodilla.testing.shape;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
@DisplayName("Tests")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    public ShapeCollectorTestSuite() {
    }

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        ++testCounter;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square1", "25");
        shapeCollector.addFigure(square);
        Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        System.out.println("List size after adding one square: " + shapeCollector.getShapesQuantity());
    }

    @Test
    void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square1", "25");
        shapeCollector.addFigure(square);
        boolean result = shapeCollector.removeFigure(square);
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getShapesQuantity());
        System.out.println("List size after removing one square: " + shapeCollector.getShapesQuantity());
    }

    @Test
    void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square1", "25");
        shapeCollector.addFigure(square);
        Shape retrievedShape = shapeCollector.getFigure(0);
        Assertions.assertEquals(square, retrievedShape);
    }

    @Test
    void testShowFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("Square", "25");
        shapeCollector.addFigure(square);
        Triangle triangle = new Triangle("Triangle", "25");
        shapeCollector.addFigure(triangle);
        Circle circle = new Circle("Circle", "25");
        shapeCollector.addFigure(circle);
        String names = shapeCollector.showFigures();
        String var10001 = circle.getShapeName();
        Assertions.assertEquals(names, var10001 + triangle.getShapeName() + square.getShapeName());
    }
}
