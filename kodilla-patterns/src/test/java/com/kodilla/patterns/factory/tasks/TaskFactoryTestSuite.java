package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShopping(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());

    }

    @Test
    void testFactoryPainting(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        //Then
        assertEquals("Painting", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        //Then
        assertEquals("Driving", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}