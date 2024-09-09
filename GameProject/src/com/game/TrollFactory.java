package com.game;

public class TrollFactory extends EnemyFactory {
    public Enemy createEnemy() {
        return new Troll();
    }
}

