package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When
        Board board = (Board) context.getBean("getBoard");

        board.getToDoList().getTask().add("Third tasks");
        board.getInProgressList().getTask().add("Second tasks");
        board.getDoneList().getTask().add("First tasks");

        //Then
        assertEquals("Third tasks", board.getToDoList().getTask().get(0));
        assertEquals("Second tasks", board.getInProgressList().getTask().get(0));
        assertEquals("First tasks", board.getDoneList().getTask().get(0));

    }
}
