package at.obe.games.strategy;

import org.newdawn.slick.GameContainer;

import java.util.Random;

public class MoveRandom implements MoveStrategy {
    private float x, y, speedX, speedY, speedFactor;
    private Random random = new Random();

    public MoveRandom(float x, float y, float speedFactor){
        super();
        this.x = x;
        this.y = y;
        this.speedFactor = speedFactor;
        float angle = random.nextFloat() * 360;
        speedX = (float) Math.cos(Math.toRadians(angle)) * this.speedFactor;
        speedY = (float) Math.sin(Math.toRadians(angle)) * this.speedFactor;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.x += speedX;
        this.y += speedY;

        if (this.x < 0 || this.x > gc.getWidth() || this.y < 0 || this.y > gc.getHeight()) {
            float angle = random.nextFloat() * 360;

            speedX = (float) Math.cos(Math.toRadians(angle)) * this.speedFactor;
            speedY = (float) Math.sin(Math.toRadians(angle)) * this.speedFactor;
        }
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
