package WinterGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor {
    private double x,y;

    public RectActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gameContainer, int delta){
        this.x++;
    }

    public void render(Graphics graphics){
        graphics.drawRect((float)this.x,(float)this.y,20,20);
    }
}
