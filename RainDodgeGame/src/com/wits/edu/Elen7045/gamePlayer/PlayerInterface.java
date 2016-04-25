package com.wits.edu.Elen7045.gamePlayer;

import java.awt.*;

/**
 * Created by Norman Mulaudzi on 2016/04/18.
 */
public interface PlayerInterface {

        void draw(Graphics2D g);
        void CorrectPlayerHorizontalBounds();
        void setPlayerPosition_X_Axis( int playerPosition_X_Axis);
        boolean isPlayerRainDropCollide(Rectangle rainRectangle);


        // used for checking collissions

       Rectangle getBounds();
    }


