/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskmanager;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nuwan
 */
public class Main {
    private static final int VIEW_TASKS_OPTION = 1;
    private static final int ADD_TASK_OPTION = 2;
    private static final int EXIT_OPTION = 3;

    private static Scanner scanner;
    private static TaskManager taskManager;
    private static TaskFactory taskFactory;

    public static void main(String[] args) {
        // Initialize the application components
        scanner = new Scanner(System.in);
        TaskRepository taskRepository = new TaskRepository();
        taskManager = new TaskManager(taskRepository);
        taskFactory = new TaskFactory();

        // Welcome message
        System.out.println("Welcome to Task Manager!");

        // Run the application
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = readChoice();
            switch (choice) {
                case VIEW_TASKS_OPTION:
                    viewTasks();
                    break;
                case ADD_TASK_OPTION:
                    addTask();
                    break;
                case EXIT_OPTION:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        // Cleanup resources
        scanner.close();
        System.out.println("Exiting Task Manager. Goodbye!");
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. View Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int readChoice() {
        return scanner.nextInt();
    }

    private static void viewTasks() {
        System.out.println("\nAll Tasks:");
        List<Task> allTasks = taskManager.getAllTasks();
        if (allTasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (Task task : allTasks) {
                System.out.println("ID: " + task.getId() + ", Type: "+ task.getType() + ", Title: " + task.getTitle() + ", Description: "
                        + task.getDescription() + ", Due Date: " + task.getDueDate() + ", Status: " + task.getStatus());
            }
        }
    }

    private static void addTask() {
        System.out.print("\nEnter task ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter task title: ");
        String title = scanner.nextLine();

        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter task due date (YYYY-MM-DD): ");
        String dueDateStr = scanner.nextLine();
        LocalDate dueDate = LocalDate.parse(dueDateStr);

        System.out.print("Enter task type (PERSONAL/ WORK/ REGULAR/ URGENT): ");
        String taskTypeStr = scanner.nextLine();
        TaskType taskType = TaskType.valueOf(taskTypeStr.toUpperCase());

        Task task = taskFactory.createTask(taskType, id, title, description, dueDate);
        taskManager.addTask(task);

        System.out.println("\nTask added successfully.");
    }
}
