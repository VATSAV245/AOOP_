package com.game;

public class GameState {
    private static GameState instance;
    private int level;
    private String difficulty;

    private GameState() {
        this.level = 1;
        this.difficulty = "Easy";
    }

    public static synchronized GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public int getLevel() {
        return level;
    }

    public void nextLevel() {
        level++;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}

