/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanager;

import java.time.LocalDate;

/**
 *
 * @author nuwan
 */
public abstract class Task {
    private int id;
    private TaskType type;
    private String title;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;
    
    // Constructor
    public Task(int id, TaskType type, String title, String description, LocalDate dueDate){
        this.id = id;
        this.type = type;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = TaskStatus.PENDING;
    }
    
    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void markAsCompleted(){
        this.status = TaskStatus.COMPLETED;
    }
    
    public void markAsInComplete(){
        this.status = TaskStatus.PENDING;
    }
    
    public void markAsExpired(){
        this.status = TaskStatus.EXPIERED;
    }
}



