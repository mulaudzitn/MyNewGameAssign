package com.wits.edu.Elen7045.GameLevels;

import java.awt.*;

/**
 * Created by Norman Mulaudzi on 2016/04/18.
 */
public interface GameLevelInterface {

    float getWindSpeed();
    float getGravitySpeed();
    double getRainChance();
    int getDropRepaintTimeMS();
    float getRainWidth();
    double getDropInitialVelocity();
    double getDropDiameter();
    Color getDropColor();
    int get_X_PlayerPosition();
    int getFinal_Y_PlayerPosition();

}
