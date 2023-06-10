/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nuwan
 */
public class TaskRepository {
    private List<Task> tasks;
    
    public TaskRepository(){
        tasks = new ArrayList<>();
    }
    
    public void addTask(Task task){
        tasks.add(task);
    }
    
    public List<Task> getAllTasks(){
        return tasks;
    }
}
