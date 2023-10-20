package at.obe.games.actors;

import at.obe.games.bestgame.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class RectActor implements Actor{
    private float x, y, height, width;
    private MoveStrategy moveStrategy;

    public RectActor(float x, float y, float height, float width, MoveStrategy moveStrategy){
        super();
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.moveStrategy.update(gc, delta);
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) {
        graphics.drawRect(this.x, this.y, this.width, this.height);
    }
}
