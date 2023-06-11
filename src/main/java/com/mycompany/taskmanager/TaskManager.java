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
    
    public Task getTaskById(int taskId) {
        return taskRepo.getTaskById(taskId);
    }
    
    public boolean deleteTask(int taskId) {
        return taskRepo.deleteTask(taskId);
    }
}
