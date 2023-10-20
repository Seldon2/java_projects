package at.obe.games.bestgame;

import at.obe.games.actors.*;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;


public class MainGame extends BasicGame {
    private List<Actor> actors;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.actors = new ArrayList<>();
        MoveStrategy m1 = new MoveRandom(100, 100, 0.5f);
        this.actors.add(new CircleActor(100, 100, 50, 0.5f));
        this.actors.add(new RectActor(100, 200, 50, 100, m1));
        this.actors.add(new OvalActor(100, 300, 100, 50, 1.2f));
        this.actors.add(new HexagonActor(300, 400, 20, 0.8f));
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for(Actor actor : actors){
            actor.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for(Actor actor : actors){
            actor.render(gc, graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("First Game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
