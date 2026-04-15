package com.example.tasktracker;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public TaskService() {
        tasks.add(new Task(101L, "Setup Login Page", "Created First Variable", "In_Progress", "Vicky"));

    }
    public List<Task> getTasks() {
        return tasks;
    }
    public Task createTask(Task task) {
        task.setId(nextId++);
        nextId++;
        tasks.add(task);
        return task;
    }
}
