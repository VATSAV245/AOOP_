package com.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoListManager {
    private List<Task> tasks;

    public ToDoListManager() {
        tasks = new ArrayList<>();
    }

    // Add a new task
    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    // Update a task's description
    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setDescription(newDescription);
        } else {
            System.out.println("Invalid index");
        }
    }

    // Remove a task by its index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
	