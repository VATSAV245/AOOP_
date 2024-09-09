package com.ridesharing;

class UserAuthentication {
    private static UserAuthentication instance;
    private boolean isAuthenticated;
    private String currentUser;

    private UserAuthentication() { 
        isAuthenticated = false; 
    }

    public static synchronized UserAuthentication getInstance() {
        if (instance == null) instance = new UserAuthentication();
        return instance;
    }

    public void login(String username) {
        if (!isAuthenticated) {
            currentUser = username;
            isAuthenticated = true;
            System.out.println(username + " logged in.");
        }
    }

    public void logout() {
        if (isAuthenticated) {
            System.out.println(currentUser + " logged out.");
            isAuthenticated = false;
        }
    }
}
