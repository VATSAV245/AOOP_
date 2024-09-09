package com.game;

public class BasicItemFactory extends ItemFactory {
    public Weapon createWeapon() {
        return new Sword();
    }

    public PowerUp createPowerUp() {
        return new Shield();
    }
}
