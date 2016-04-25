package com.wits.edu.Elen7045.gameCollisionDetector;

import java.awt.*;

/**
 * Created by Norman Mulaudzi on 2016/04/19.
 */
public class ConstructiveCollisions {
    public boolean checkForCollisions (Rectangle rainDropRectangle,Rectangle playerRectangle){
        if ( rainDropRectangle.intersects(playerRectangle)){
            return false;
        }
        return false;
    }
}
