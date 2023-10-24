package at.obe.games.actors;

import at.obe.games.observer.Observer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import at.obe.games.strategy.MoveStrategy;

public class CircleActor implements Actor, Observer {
    private float radius;

    private Color color;

    private MoveStrategy moveStrategy;


    public CircleActor(float radius, MoveStrategy moveStrategy){
        super();
        this.radius = radius;
        this.moveStrategy = moveStrategy;
        this.color = Color.white;
    }

    public void update(GameContainer gc, int delta){
       this.moveStrategy.update(gc, delta);
    }

    public void render(GameContainer gc, Graphics graphics){
        graphics.setColor(this.color);
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), this.radius, this.radius);
        graphics.setColor(Color.white);
    }

    @Override
    public void inform() {
        this.color = Color.cyan;
    }
}
