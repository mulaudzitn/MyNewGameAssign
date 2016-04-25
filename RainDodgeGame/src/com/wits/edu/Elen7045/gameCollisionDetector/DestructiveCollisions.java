package com.wits.edu.Elen7045.gameCollisionDetector;

import java.awt.*;

/**
 * Created by Norman Mulaudzi on 2016/04/19.
 */
public class DestructiveCollisions implements CollisionsInterface {

    public boolean checkForCollisions (Rectangle playerRectangle, Rectangle dropRectangle ){

         /*if ( playerRectangle.contains(dropRectangle)){
            System.out.println("I have reached Nirvana");
       }else
        if ( dropRectangle.intersects(playerRectangle)){

            System.out.println( " player X Axis " + playerRectangle.getX() );
            System.out.println( " player Y Axis " + playerRectangle.getY() );
            System.out.println( " Rain X Axis " + dropRectangle.getX() );
            System.out.println( " Rain Y Axis " + dropRectangle.getY() );
           if ( dropRectangle.getY() ==  playerRectangle.getX() ) {
                System.out.println("I have reached 2nd Nirvana");
           }
            System.out.println("I have reached a col");
            return true;
        }*/

        if ( playerRectangle.getX() == dropRectangle.getX()  ){

            return true;
        }

        return false;
    }
}
