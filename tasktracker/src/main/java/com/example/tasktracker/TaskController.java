package com.example.tasktracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @GetMapping("/Task")
    public  List<Task> getTasks(){
        return List.of(
                new Task(
                        101L,
                        "Fuck off",
                        "Create First Version",
                        "IN_Progress",
                        "Vicky"
                )
        );
    }
}
