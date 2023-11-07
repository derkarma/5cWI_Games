package WinterGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.awt.*;

public interface Actor {
    public void update(GameContainer gameContainer, int delta);
    public void render(Graphics graphics);

}
