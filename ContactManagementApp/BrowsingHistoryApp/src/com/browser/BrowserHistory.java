package com.browser;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> backStack;
    private Deque<String> forwardStack;
    private String currentPage;

    public BrowserHistory() {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
    }

    // Add a new page to the history
    public void visitPage(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear(); // Clear forward history when a new page is visited
        System.out.println("Visited: " + currentPage);
    }

    // Go back to the previous page
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Went back to: " + currentPage);
        } else {
            System.out.println("No previous page to go back to.");
        }
    }

    // Go forward to the next page
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Went forward to: " + currentPage);
        } else {
            System.out.println("No forward page to go to.");
        }
    }

    // Display the current page
    public void displayCurrentPage() {
        if (currentPage != null) {
            System.out.println("Current Page: " + currentPage);
        } else {
            System.out.println("No page is currently open.");
        }
    }
}
