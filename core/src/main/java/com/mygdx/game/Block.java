package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class Block {
    private String material;  // Wood, Glass, Steel
    private int health;
    private Vector2 position;
    private float weight;

    public Block(String material, int health, Vector2 position, float weight) {
        this.material = material;
        this.health = health;
        this.position = position;
        this.weight = weight;
    }

    public boolean takeHit(int damage) {
        health -= damage;
        return health <= 0;
    }

    public void collapse() {
        System.out.println("Block collapsed!");
        // Logic for collapsing the block
    }

    public void reset() {
        // Reset block state
    }
}
