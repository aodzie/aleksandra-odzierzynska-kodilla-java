package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testTaskDaoSave() {
        //Given
        TaskList taskList = new TaskList("tasklist1", "new tasklist");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        taskListDao.deleteById(id);
    }

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("tasklist1", "new tasklist");
        taskListDao.findByListName("tasklist1");

        //When
        taskListDao.save(taskList);
        List<TaskList> resultList = taskListDao.findByListName("tasklist1");

        //Then
        assertEquals("tasklist1", resultList.get(0).getListName());

        //CleanUp
       taskListDao.delete(taskList);

    }
}
