package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class Catapult {
    private Birds currentBird;
    private Vector2 position;
    private float angle;
    private float force;

    public Catapult(Vector2 position) {
        this.position = position;
    }

    public void loadBird(Birds bird) {
        this.currentBird = bird;
        System.out.println("Bird loaded on the catapult: " + bird.type);
    }

    public void launchBird(float angle, float force) {
        this.angle = angle;
        this.force = force;
        if (currentBird != null) {
            currentBird.launch(angle, force);
        }
    }

    public void reset() {
        // Reset the catapult
    }
}

