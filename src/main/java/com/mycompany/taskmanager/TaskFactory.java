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
public class TaskFactory {

    public Task createTask(TaskType type, int id, String title, String description, LocalDate dueDate) {
        switch (type) {
            case REGULAR:
                return new RegularTask(id, type, title, description, dueDate);
            case URGENT:
                return new UrgentTask(id, type, title, description, dueDate);
            case PERSONAL:
                return new RegularTask(id, type, title, description, dueDate);
            case WORK:
                return new RegularTask(id, type, title, description, dueDate);
            default:
                throw new IllegalArgumentException("Invalid task type: " + type);
        }
    }
}
