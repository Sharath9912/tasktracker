package com.example.tasktracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class TaskController {
    private final List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public TaskController() {
        tasks.add(new Task(101L, "SetupLogin page", "Created First Varsiom", "In_Progress","Bivky"));
        nextId = 104L;
    }
    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return tasks;
    }
    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        task.setId(nextId);
        nextId++;
        tasks.add(task);
        return task;
    }

}
