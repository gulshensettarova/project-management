package com.company.project_managment.service.v1.impl;

import com.company.project_managment.mapper.TaskMapper;
import com.company.project_managment.model.dao.entity.Task;
import com.company.project_managment.model.dao.repository.TaskRepository;
import com.company.project_managment.model.dto.request.create.TaskCreateRequest;
import com.company.project_managment.model.dto.request.update.TaskUpdateRequest;
import com.company.project_managment.model.dto.response.TaskResponse;
import com.company.project_managment.service.v1.inter.TaskInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService implements TaskInterface {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public TaskService(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    @Override
    public boolean createTask(TaskCreateRequest request) {
        Task task = taskMapper.toEntity(request);
        taskRepository.save(task);
        return true;
    }

    @Override
    public Task updateTask(int id, TaskUpdateRequest request) {
        Task newTask = taskMapper.toEntity(request);
        Task oldTask= taskRepository.findById(id).get();
        oldTask.setCategory(newTask.getCategory());
        oldTask.setDescription(newTask.getDescription());
        oldTask.setPriority(newTask.getPriority());
        taskRepository.save(oldTask);
        return oldTask;
    }

    @Override
    public void deleteTask(int id) {
        taskRepository.deleteById(id);

    }

    @Override
    public List<Task> getTasksByCategory(String category) {
        return taskRepository.findByCategory(category);
    }

    @Override
    public List<Task> getAllTasks() {

        return taskRepository.findAll();

    }

    @Override
    public Task getTaskById(int id) {
        return taskRepository.findById(id).get();
    }
}
