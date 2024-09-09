
package com.game;

public class Main {
    public static void main(String[] args) {
        // Manage game state using Singleton
        GameState gameState = GameState.getInstance();
        gameState.setDifficulty("Hard");
        System.out.println("Current level: " + gameState.getLevel());
        System.out.println("Difficulty: " + gameState.getDifficulty());

        // Create enemies using Factory Method
        EnemyFactory enemyFactory = new GoblinFactory();
        Enemy enemy = enemyFactory.createEnemy();
        enemy.attack();

        // Create items using Abstract Factory
        ItemFactory itemFactory = new BasicItemFactory();
        Weapon weapon = itemFactory.createWeapon();
        weapon.use();

        PowerUp powerUp = itemFactory.createPowerUp();
        powerUp.apply();

        // Move to next level
        gameState.nextLevel();
        System.out.println("Next level: " + gameState.getLevel());
    }
}

