package at.obe.games.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import at.obe.games.strategy.MoveStrategy;

public class OvalActor implements Actor {
    private float height, width;

    private MoveStrategy moveStrategy;

    public OvalActor(float height, float width, MoveStrategy moveStrategy) {
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
        graphics.drawOval(this.moveStrategy.getX(), this.moveStrategy.getY(), this.width, this.height);
    }
}
