package gameCollisionDetector;

import java.awt.*;

/**
 * Created by Norman Mulaudzi on 2016/04/19.
 */
public class DestructiveCollisions implements CollisionsInterface {

    public boolean checkForCollisions (Rectangle playerRectangle, Rectangle dropRectangle ){

         if ( playerRectangle.contains(dropRectangle)){
            System.out.println("I have reached Nirvana");
       }else
        if ( dropRectangle.intersects(playerRectangle)){
           if ( dropRectangle.getY() ==  playerRectangle.getX() ) {
                System.out.println("I have reached 2nd Nirvana");
           }
            System.out.println("I have reached 3rd Nirvana");
            return true;
        }
        return false;
    }
}
