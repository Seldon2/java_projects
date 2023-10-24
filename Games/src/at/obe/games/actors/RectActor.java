package at.obe.games.actors;

import at.obe.games.observer.Observer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import at.obe.games.strategy.MoveStrategy;


public class RectActor implements Actor, Observer {
    private float height, width;
    private MoveStrategy moveStrategy;

    private Color color;

    public RectActor(float height, float width, MoveStrategy moveStrategy){
        super();
        this.height = height;
        this.width = width;
        this.moveStrategy = moveStrategy;
        this.color = Color.white;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.moveStrategy.update(gc, delta);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawRect(this.moveStrategy.getX(), this.moveStrategy.getY(), this.width, this.height);
        graphics.setColor(Color.white);
    }

    @Override
    public void inform() {
        this.color = Color.pink;
    }
}
