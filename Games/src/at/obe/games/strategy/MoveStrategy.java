package at.obe.games.strategy;

import org.newdawn.slick.GameContainer;

public interface MoveStrategy {
    public void update(GameContainer gc, int delta);
    public float getX();
    public float getY();
}
