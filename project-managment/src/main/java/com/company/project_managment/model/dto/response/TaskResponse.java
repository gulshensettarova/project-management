package com.company.project_managment.model.dto.response;

import com.company.project_managment.model.dao.entity.Category;

import javax.swing.text.StyledEditorKit;
import java.sql.Timestamp;

public class TaskResponse {
    private int id;
    private String title;
    private String description;
    private Category  category;
    private boolean isActive;
    private Timestamp createAt;
}
