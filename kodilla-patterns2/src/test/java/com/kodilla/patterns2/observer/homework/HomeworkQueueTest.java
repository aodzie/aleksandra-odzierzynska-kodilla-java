package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkQueueTest {

    @Test
    public void testUpdateHomeworkList(){
        //Given
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        Student student1 = new Student("student1");
        Student student2 = new Student("student2");
        Student student3 = new Student("student3");
        Student student4 = new Student("student4");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor1);
        student4.registerObserver(mentor2);

        //When
        student1.sendHomework("task1");
        student1.sendHomework("task2");
        student2.sendHomework("task1");
        student2.sendHomework("task2");
        student2.sendHomework("task3");
        student3.sendHomework("task1");
        student4.sendHomework("task1");
        student4.sendHomework("task2");
        student4.sendHomework("task3");

        //Then
        assertEquals(3, mentor2.getUpdateCount());

    }
}
