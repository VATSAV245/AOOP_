package com.contacts;

import java.util.Scanner;

public class ContactApp {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nContact Management:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Get Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    manager.addContact(new Contact(name, phoneNumber, email));
                    break;
                case 2:
                    System.out.print("Enter name of contact to remove: ");
                    String nameToRemove = scanner.nextLine();
                    manager.removeContact(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter name of contact to get: ");
                    String nameToGet = scanner.nextLine();
                    Contact contact = manager.getContact(nameToGet);
                    if (contact != null) {
                        System.out.println("Contact found: " + contact);
                    } else {
                        System.out.println("Contact not found with name: " + nameToGet);
                    }
                    break;
                case 4:
                    manager.displayAllContacts();
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
