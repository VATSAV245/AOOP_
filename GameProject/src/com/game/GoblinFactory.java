package com.game;

public class GoblinFactory extends EnemyFactory {
    public Enemy createEnemy() {
        return new Goblin();
    }
}

