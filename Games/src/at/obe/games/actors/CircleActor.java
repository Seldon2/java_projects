package at.obe.games.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class CircleActor implements Actor {
    private float x, y, radius, speedX, speedY, speedFactor;
    private Random random = new Random();

    public CircleActor(float x, float y, float radius) {
        this(x, y, radius, 1.0f);
    }

    public CircleActor(float x, float y, float radius,float speedFactor){
        super();
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.speedFactor = speedFactor;
        float angle = random.nextFloat() * 360;
        speedX = (float) Math.cos(Math.toRadians(angle)) * this.speedFactor;
        speedY = (float) Math.sin(Math.toRadians(angle)) * this.speedFactor;

    }

    public void update(GameContainer gc, int delta){
        this.x += speedX;
        this.y += speedY;

        if (x < 0 || x > gc.getWidth() || y < 0 || y > gc.getHeight()) {

            float angle = random.nextFloat() * 360;

            speedX = (float) Math.cos(Math.toRadians(angle)) * this.speedFactor;
            speedY = (float) Math.sin(Math.toRadians(angle)) * this.speedFactor;
        }
    }

    public void render(GameContainer gc, Graphics graphics){
        graphics.drawOval(this.x, this.y, this.radius, this.radius);
    }
}
