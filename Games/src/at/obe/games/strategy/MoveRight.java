package at.obe.games.strategy;

import org.newdawn.slick.GameContainer;

public class MoveRight implements MoveStrategy {
    float x, y, speedFactor;

    public MoveRight(float x, float y, float speedFactor){
        super();
        this.x = x;
        this.y = y;
        this.speedFactor = speedFactor;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.x += delta * speedFactor;
    }

    @Override
    public float getX() {
        return this.x;
    }

    @Override
    public float getY() {
        return this.y;
    }
}
