package at.obe.games.actors;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    public void update(GameContainer gc, int delta);
    public void render(GameContainer gc, Graphics graphics);
}
