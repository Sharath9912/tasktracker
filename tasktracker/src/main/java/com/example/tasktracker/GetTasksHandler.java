package com.example.tasktracker;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class GetTasksHandler implements RequestHandler<Map<String, Object>, List<Task>> {
    private static final TaskService taskService = new TaskService();

    @Override
    public List<Task> handleRequest(Map<String, Object> input, Context context) {
        return taskService.getTasks();
    }
}
