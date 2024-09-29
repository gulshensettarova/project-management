package com.company.project_managment.model.dto.request.create;

import com.company.project_managment.model.dao.entity.Category;
import lombok.Data;

@Data
public class TaskCreateRequest {
    private String title;
    private String description;
    private int priority;
    private Category  category;
}
