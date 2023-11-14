package WinterGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class OvalActor implements Actor{
    private double x,y;

    public OvalActor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y += 0.2;
        if(this.y > 600){
            this.y = -10;
        }

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRoundRect((float)this.x,(float)this.y,12,11,150);

    }
}
