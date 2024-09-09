package com.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "John Doe", 50000));
        employees.add(new Employee(1, "Jane Smith", 60000));
        employees.add(new Employee(2, "Alice Johnson", 55000));

        // Print original list
        System.out.println("Original list:");
        printEmployees(employees);

        // Sort by ID (natural ordering)
        Collections.sort(employees);
        System.out.println("\nSorted by ID:");
        printEmployees(employees);

        // Sort by Name using EmployeeNameComparator
        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println("\nSorted by Name:");
        printEmployees(employees);

        // Sort by Salary using EmployeeSalaryComparator
        Collections.sort(employees, new EmployeeSalaryComparator());
        System.out.println("\nSorted by Salary:");
        printEmployees(employees);

        // Clone an employee
        Employee clonedEmployee = employees.get(0).clone();
        System.out.println("\nCloned Employee:");
        System.out.println(clonedEmployee);
    }

    private static void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
