package rainDrops;

import com.wits.edu.Elen7045.GameLevels.GameLevelFactory;
import com.wits.edu.Elen7045.GameLevels.GameLevelInterface;
import com.wits.edu.Elen7045.gameScreen.GamePanel;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Random;

/**
 * Created by Norman Mulaudzi on 2016/04/18.
 */

public class Rain implements RainInterface {
    private GameLevelFactory gameLevelFactory = new GameLevelFactory();
    private GameLevelInterface gameLevel = gameLevelFactory.getGameLevel("Level1");

    private float x_Position;
    private float Y_Position;
    private float prevX;
    private float prevY;


    public Rain() {
        Random r = new Random();
        x_Position = r.nextInt(600);
        Y_Position = 0;
    }

    public void updateRain() {
        prevX = x_Position;
        prevY = Y_Position;

        x_Position += gameLevel.getWindSpeed();
        Y_Position += gameLevel.getGravitySpeed();
    }

    public void drawRain(Graphics2D g2) {
        Line2D line = new Line2D.Double(x_Position, Y_Position, prevX, prevY);
     //   System.out.println(" Rain Drop Position " + Y_Position );
        g2.draw(line);
    }
    public float getX()
    {
        return x_Position;

    }
    public float getY()
    {
        return Y_Position;
    }

    public Rectangle getBounds()
    {

   //     System.out.printf( "\n x1 = %d , y1 = %d, X2 = %d, y2 = %d", x1,y1,x2,y2);
        return new Rectangle((int)x_Position,(int)Y_Position,(int)prevX,(int)prevY);
    }
}