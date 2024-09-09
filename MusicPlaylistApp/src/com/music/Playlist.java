package com.music;

import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> songs;

    public Playlist() {
        songs = new LinkedList<>();
    }

    // Add a song to the playlist
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added: " + song);
    }

    // Remove a song by title
    public void removeSong(String title) {
        Song songToRemove = null;
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                songToRemove = song;
                break;
            }
        }
        if (songToRemove != null) {
            songs.remove(songToRemove);
            System.out.println("Removed: " + songToRemove);
        } else {
            System.out.println("Song not found: " + title);
        }
    }

    // Move a song to a different position
    public void moveSong(String title, int newPosition) {
        Song songToMove = null;
        int currentIndex = -1;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equalsIgnoreCase(title)) {
                songToMove = songs.remove(i);
                currentIndex = i;
                break;
            }
        }
        if (songToMove != null) {
            if (newPosition < 0 || newPosition >= songs.size()) {
                songs.addLast(songToMove);
                System.out.println("Moved to end: " + songToMove);
            } else {
                songs.add(newPosition, songToMove);
                System.out.println("Moved: " + songToMove);
            }
        } else {
            System.out.println("Song not found: " + title);
        }
    }

    // Display the playlist
    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }
}
