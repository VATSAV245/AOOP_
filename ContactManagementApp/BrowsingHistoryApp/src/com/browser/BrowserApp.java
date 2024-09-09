package com.browser;

import java.util.Scanner;

public class BrowserApp {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBrowser History:");
            System.out.println("1. Visit a New Page");
            System.out.println("2. Go Back to Previous Page");
            System.out.println("3. Go Forward to Next Page");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String url = scanner.nextLine();
                    browserHistory.visitPage(url);
                    break;
                case 2:
                    browserHistory.goBack();
                    break;
                case 3:
                    browserHistory.goForward();
                    break;
                case 4:
                    browserHistory.displayCurrentPage();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
