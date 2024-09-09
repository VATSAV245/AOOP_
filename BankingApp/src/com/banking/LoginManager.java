package com.banking;

public class LoginManager {
    // The single instance of LoginManager
    private static LoginManager instance;

    // Variable to store the login state
    private boolean isLoggedIn;
    
    // Variable to store the current user
    private String currentUser;

    // Private constructor to prevent instantiation
    private LoginManager() {
        isLoggedIn = false; // Initially, no user is logged in
        currentUser = null;
    }

    // Public method to provide access to the single instance
    public static synchronized LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    // Method to log in a user
    public void login(String username) {
        if (!isLoggedIn) {
            currentUser = username;
            isLoggedIn = true;
            System.out.println(username + " logged in successfully.");
        } else {
            System.out.println("A user is already logged in.");
        }
    }

    // Method to log out the current user
    public void logout() {
        if (isLoggedIn) {
            System.out.println(currentUser + " logged out successfully.");
            currentUser = null;
            isLoggedIn = false;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    // Method to check if a user is logged in
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    // Method to get the current logged-in user
    public String getCurrentUser() {
        return currentUser;
    }
}
