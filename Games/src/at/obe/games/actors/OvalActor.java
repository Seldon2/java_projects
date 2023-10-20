package at.obe.games.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class OvalActor implements Actor {
    private float x, y, height, width, speedX, speedY, speedFactor;

    private Random random = new Random();

    public OvalActor(float x, float y, float height, float width){
        this(x, y, height, width, 1.0f);
    }

    public OvalActor(float x, float y, float height, float width, float speedFactor){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.speedFactor = speedFactor;
        float angle = random.nextFloat() * 360;
        speedX = (float) Math.cos(Math.toRadians(angle)) * this.speedFactor;
        speedY = (float) Math.sin(Math.toRadians(angle)) * this.speedFactor;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.x += speedX;
        this.y += speedY;

        if (x < 0 || x > gc.getWidth() || y < 0 || y > gc.getHeight()) {

            float angle = random.nextFloat() * 360;

            speedX = (float) Math.cos(Math.toRadians(angle)) * this.speedFactor;
            speedY = (float) Math.sin(Math.toRadians(angle)) * this.speedFactor;
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.width, this.height);
    }
}
