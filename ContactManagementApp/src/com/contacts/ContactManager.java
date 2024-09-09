package com.contacts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contactsSet;
    private Map<String, Contact> contactsMap;

    public ContactManager() {
        contactsSet = new HashSet<>();
        contactsMap = new HashMap<>();
    }

    // Add a new contact
    public void addContact(Contact contact) {
        if (contactsSet.add(contact)) {
            contactsMap.put(contact.getName(), contact);
            System.out.println("Contact added: " + contact);
        } else {
            System.out.println("Contact with this name already exists: " + contact);
        }
    }

    // Remove a contact by name
    public void removeContact(String name) {
        Contact removedContact = contactsMap.remove(name);
        if (removedContact != null) {
            contactsSet.remove(removedContact);
            System.out.println("Contact removed: " + removedContact);
        } else {
            System.out.println("Contact not found with name: " + name);
        }
    }

    // Get a contact by name
    public Contact getContact(String name) {
        return contactsMap.get(name);
    }

    // Display all contacts
    public void displayAllContacts() {
        if (contactsSet.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contactsSet) {
                System.out.println(contact);
            }
        }
    }
}
