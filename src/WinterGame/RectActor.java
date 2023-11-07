package WinterGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor implements Actor{
    private double x,y;

    public RectActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void update(GameContainer gameContainer, int delta){
        this.y += 0.4;
        if(this.y > 600){
            this.y = -10;
        }
    }

    public void render(Graphics graphics){
        graphics.drawRect((float)this.x,(float)this.y,20,20);
    }
}
