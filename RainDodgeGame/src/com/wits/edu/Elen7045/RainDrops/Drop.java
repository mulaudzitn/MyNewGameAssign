package com.wits.edu.Elen7045.RainDrops;

import com.wits.edu.Elen7045.GameLevels.GameLevelFactory;
import com.wits.edu.Elen7045.GameLevels.GameLevelInterface;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.function.ToIntBiFunction;

/**
 * Created by Norman Mulaudzi on 2016/04/18.
 */

 public class Drop  implements   DropsInterface{

    private GameLevelFactory gameLevelFactory = new GameLevelFactory();
    private GameLevelInterface gameLevel = gameLevelFactory.getGameLevel("Level1");
    private double x0_Initial;
    private double y0_Initial;
    private double v0_initial_Velocity; //initial velocity
    private double time;  //time
    private double falling_angle;
    private double x_Current;
    private double y_Current;

    public Drop(double x0, double y0) {
        super();
        this.x0_Initial = x0;
        this.y0_Initial = y0;

        v0_initial_Velocity = gameLevel.getDropInitialVelocity();
        falling_angle = Math.toRadians(Math.round(Math.random() * 180)); //from 0 - 180 degrees
    }

    public void updateRainDrops() {
        // double g=10;
        time += gameLevel.getDropRepaintTimeMS() / 100f;
        x_Current = x0_Initial + v0_initial_Velocity * time * Math.cos(falling_angle);
        y_Current = y0_Initial - (v0_initial_Velocity * time * Math.sin(falling_angle) - gameLevel.getGravitySpeed() * time * time / 2);
    }

    public void draw(Graphics2D g2) {
       // g2.setColor(Color.WHITE);
        Ellipse2D.Double circle = new Ellipse2D.Double(x_Current, y_Current, gameLevel.getDropDiameter(), gameLevel.getDropDiameter());
        g2.fill(circle);
    }

    public double getY()
    {
        return y_Current;
    }

    public Rectangle getBounds() {
         int x = (int)x_Current;
         int y = (int)y_Current;
         int diameter = (int)gameLevel.getDropDiameter();
         return new Rectangle(x,y,diameter,diameter);
    }

}