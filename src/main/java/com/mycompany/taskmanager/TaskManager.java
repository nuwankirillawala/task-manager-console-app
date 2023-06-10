/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskmanager;

import java.util.List;

/**
 *
 * @author nuwan
 */
public class TaskManager {
    private TaskRepository taskRepo;
    
    public TaskManager(TaskRepository taskRepo){
        this.taskRepo = taskRepo;
    }
    
    public void addTask(Task task){
        taskRepo.addTask(task);
    }
    
    public List<Task> getAllTasks(){
        return taskRepo.getAllTasks();
    }
}
