package WinterGame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.List;

public class MainGame extends BasicGame {
    private CircleActor ca1,ca2;
    private RectActor ra1,ra2;
    private int x,y;




    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
       this.ca1 = new CircleActor(100,100);
       this.ca2 = new CircleActor(100,200);
       this.ra1 = new RectActor(100,300);
       this.ra2 = new RectActor(100,400);


    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.ca1.update(gameContainer,delta);
        this.ca2.update(gameContainer,delta);
        this.ra1.update(gameContainer,delta);
        this.ra2.update(gameContainer,delta);


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.ca1.render(graphics);
        this.ca2.render(graphics);
        this.ra1.render(graphics);
        this.ra2.render(graphics);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}