package com.company.project_managment.model.dto.request.update;

import com.company.project_managment.model.dao.entity.Category;

public class TaskUpdateRequest {
    private String title;
    private String description;
    private int priority;
    private Category category;
}
