package com.banking;

public class BankingOperations {

    public void viewBalance() {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println("Displaying balance for " + loginManager.getCurrentUser());
            // Logic to view balance
        } else {
            System.out.println("Please log in to view your balance.");
        }
    }

    public void deposit(double amount) {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println("Depositing " + amount + " for " + loginManager.getCurrentUser());
            // Logic to deposit amount
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        LoginManager loginManager = LoginManager.getInstance();
        if (loginManager.isLoggedIn()) {
            System.out.println("Withdrawing " + amount + " for " + loginManager.getCurrentUser());
            // Logic to withdraw amount
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}

