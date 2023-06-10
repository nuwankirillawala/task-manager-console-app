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
public class RegularTask extends Task {
    // Additional properties and methods specific to RegularTask

    public RegularTask(int id, TaskType type, String title, String description, LocalDate dueDate) {
        super(id, type, title, description, dueDate);
        // Initialize RegularTask specific properties
    }
}
