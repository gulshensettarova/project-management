package com.company.project_managment.controller.v1;

import com.company.project_managment.model.dao.entity.Task;
import com.company.project_managment.model.dto.response.TaskResponse;
import com.company.project_managment.service.v1.impl.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
   private TaskService taskService;
   public TaskController(TaskService taskService) {
       this.taskService = taskService;
   }
   @GetMapping("/all")
    public List<Task> getAllTasks() {
       return taskService.getAllTasks();
   }



}
