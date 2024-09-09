package com.music;

import java.util.Scanner;

public class MusicApp {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMusic Playlist Application:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter song artist: ");
                    String artist = scanner.nextLine();
                    playlist.addSong(new Song(title, artist));
                    break;
                case 2:
                    System.out.print("Enter song title to remove: ");
                    String titleToRemove = scanner.nextLine();
                    playlist.removeSong(titleToRemove);
                    break;
                case 3:
                    System.out.print("Enter song title to move: ");
                    String titleToMove = scanner.nextLine();
                    System.out.print("Enter new position: ");
                    int newPosition = scanner.nextInt();
                    playlist.moveSong(titleToMove, newPosition);
                    break;
                case 4:
                    playlist.displayPlaylist();
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

