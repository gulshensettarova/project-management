package com.company.project_managment.mapper;

import com.company.project_managment.model.dao.entity.Task;
import com.company.project_managment.model.dto.request.create.TaskCreateRequest;
import com.company.project_managment.model.dto.request.filter.TaskFilterRequest;
import com.company.project_managment.model.dto.request.update.TaskUpdateRequest;
import com.company.project_managment.model.dto.response.TaskResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskResponse ToDto(Task request);
    List<TaskResponse> ToDto(List<Task> requests);
    Task toEntity(TaskCreateRequest request);
    Task toEntity(TaskUpdateRequest request);
    Task toEntity(TaskFilterRequest request);

}
