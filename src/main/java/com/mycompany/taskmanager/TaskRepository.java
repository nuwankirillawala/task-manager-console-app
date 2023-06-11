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
    
    public Task getTaskById(int taskId){
        for(Task task: tasks){
            if(task.getId() == taskId){
                return task;
            }
        }
        return null;
    }
    
    public boolean deleteTask(int taskId){
        Task taskToDelete = null;
        for(Task task: tasks){
            if(task.getId() == taskId){
                taskToDelete = task;
                break;
            }
        }
        if(taskToDelete != null){
            tasks.remove(taskToDelete);
            return true;
        }
        return false;
    }
}
