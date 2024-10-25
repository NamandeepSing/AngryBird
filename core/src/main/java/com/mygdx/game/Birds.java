package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public abstract class Birds {
    protected float speed;
    protected int impact;
    protected Vector2 position;
    protected String type;

    public Birds(float speed, int impact, Vector2 position, String type) {
        this.speed = speed;
        this.impact = impact;
        this.position = position;
        this.type = type;
    }

    public abstract void launch(float angle, float force);

    public abstract void hit(Object target);

    public void reset() {
        // Logic to reset bird's position
    }
}
