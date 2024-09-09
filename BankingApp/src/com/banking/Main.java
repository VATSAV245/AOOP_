package com.banking;

public class Main {
    public static void main(String[] args) {
        LoginManager loginManager = LoginManager.getInstance();

        // Attempt to perform operations without logging in
        BankingOperations operations = new BankingOperations();
        operations.viewBalance(); // Should prompt to log in

        // Log in a user
        loginManager.login("Alice");

        // Perform banking operations
        operations.viewBalance(); // Should display balance for Alice
        operations.deposit(100);  // Should deposit money for Alice
        operations.withdraw(50);  // Should withdraw money for Alice

        // Log out the user
        loginManager.logout();

        // Attempt to perform operations after logging out
        operations.viewBalance(); // Should prompt to log in
    }
}
