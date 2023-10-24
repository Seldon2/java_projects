package at.obe.games.actors;

import at.obe.games.observer.Observer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Polygon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HexagonActor implements Actor{
    private Polygon hexagon;
    private float x, y, speedX, speedY, speedFactor;
    private Random random = new Random();

    private List<Observer> observers = new ArrayList<>();

    public HexagonActor(float x, float y, float size, float speedFactor){
        this.hexagon = createHexagon(x, y, size);
        this.x = x;
        this.y = y;
        this.speedFactor = speedFactor;
        float angle = random.nextFloat() * 360;
        speedX = (float) Math.cos(Math.toRadians(angle)) * this.speedFactor;
        speedY = (float) Math.sin(Math.toRadians(angle)) * this.speedFactor;
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    private Polygon createHexagon(float x, float y, float size){
        float[] points = new float[12];
        float angle = 0;

        for (int i = 0; i < 12; i += 2) {
            float newX = (float) (x + Math.cos(Math.toRadians(angle)) * size);
            float newY = (float) (y + Math.sin(Math.toRadians(angle)) * size);
            points[i] = newX;
            points[i + 1] = newY;
            angle += 60;
        }

        Polygon hexagon = new Polygon(points);
        hexagon.setClosed(true);

        return hexagon;

    }
    @Override
    public void update(GameContainer gc, int delta) {
        this.x += speedX;
        this.y += speedY;

        if (x < 0 || x > gc.getWidth() || y < 0 || y > gc.getHeight()) {
            notifyObservers();

            float angle = random.nextFloat() * 360;

            speedX = (float) Math.cos(Math.toRadians(angle)) * this.speedFactor;
            speedY = (float) Math.sin(Math.toRadians(angle)) * this.speedFactor;
        }

        float[] points = hexagon.getPoints();
        for (int i = 0; i < points.length; i += 2) {
            points[i] += speedX;
            points[i + 1] += speedY;
        }
        this.hexagon = new Polygon(points);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) {
        graphics.draw(hexagon);
    }

    private void notifyObservers(){
        for(Observer observer : this.observers){
            observer.inform();
        }
    }
}
