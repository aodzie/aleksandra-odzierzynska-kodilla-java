package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList = new TaskList();
    private TaskList inProgressList = new TaskList();
    private TaskList doneList = new TaskList();

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;

    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
