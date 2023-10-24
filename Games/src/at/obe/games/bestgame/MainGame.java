package at.obe.games.bestgame;

import at.obe.games.actors.*;
import at.obe.games.observer.Observer;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

import at.obe.games.strategy.*;

public class MainGame extends BasicGame {
    private List<Actor> actors;

    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.actors = new ArrayList<>();

        MoveStrategy m1 = new MoveRandom(100, 100, 1.2f);
        MoveStrategy m2 = new MoveRight(100, 200, 0.1f);
        MoveStrategy m3 = new MoveLeft(600, 400, 0.1f);
        MoveStrategy m4 = new MoveDown(500, 0, 0.1f);

        CircleActor circle = new CircleActor(50, m2);
        RectActor rect = new RectActor(100, 200, m3);
        HexagonActor hex = new HexagonActor(300, 400, 20, 0.5f);
        OvalActor oval = new OvalActor(150, 80, m4);

        hex.addObserver(circle);
        hex.addObserver(rect);

        this.actors.add(circle);
        this.actors.add(rect);
        this.actors.add(oval);
        this.actors.add(hex);

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
