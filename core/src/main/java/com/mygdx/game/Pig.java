package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class Pig {
    private int health;
    private Vector2 position;
    private String size;  // For example: "Small", "Medium", "Large"

    public Pig(int health, Vector2 position, String size) {
        this.health = health;
        this.position = position;
        this.size = size;
    }

    public boolean takeHit(int damage) {
        health -= damage;
        return health <= 0;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public void reset() {
        // Reset the pig's health and position
    }
}

