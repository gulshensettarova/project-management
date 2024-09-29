package com.company.project_managment.service.v1.inter;

import com.company.project_managment.model.dao.entity.Task;
import com.company.project_managment.model.dto.request.create.TaskCreateRequest;
import com.company.project_managment.model.dto.request.update.TaskUpdateRequest;
import com.company.project_managment.model.dto.response.TaskResponse;

import java.util.List;

public interface TaskInterface {
    Task createTask(TaskCreateRequest request);
    Task updateTask(int id, TaskUpdateRequest request);
    void deleteTask(int id);
    List<Task> getTasksByCategory(String category);
    List<Task> getAllTasks();
    Task getTaskById(int id);

}
