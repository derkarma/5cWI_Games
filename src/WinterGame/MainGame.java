package WinterGame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private static List<Actor> actors;




    public MainGame(String title, List<Actor> actors) {
        super(title);
        this.actors = actors;
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {this.actors = new ArrayList<>();
        this.actors.add(new CircleActor(50,100));
        this.actors.add(new CircleActor(300,200));
        this.actors.add(new CircleActor(450,200));
        this.actors.add(new CircleActor(700,200));
        this.actors.add(new RectActor(200,300));
        this.actors.add(new  RectActor(350,400));
        this.actors.add(new RectActor(623,300));
        this.actors.add(new  RectActor(820,400));
        this.actors.add(new OvalActor(180,20));
        this.actors.add(new OvalActor(480,20));
        this.actors.add(new OvalActor(310,20));
        this.actors.add(new OvalActor(560,20));


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors){
            actor.update(gameContainer, delta);
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors){
            actor.render(graphics);
        }


    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame", actors));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}