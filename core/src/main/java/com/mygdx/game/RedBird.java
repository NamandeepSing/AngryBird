package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class RedBird extends Birds {

    public RedBird(Vector2 position) {
        super(50, 1, position, "RedBird");
    }

    @Override
    public void launch(float angle, float force) {
        System.out.println(type + " is launched at angle: " + angle + " with force: " + force);
        // Launch logic
    }

    @Override
    public void hit(Object target) {
        // Logic for when RedBird hits a target
    }
}
