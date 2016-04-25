package gameCollisionDetector;


import java.awt.*;

/**
 * Created by Norman Mulaudzi on 2016/04/19.
 */
public class CollissionsContext {

    private CollisionsInterface strategy ;
    public CollissionsContext (CollisionsInterface strategy)
    {
        this.strategy =  strategy;
    }

    public boolean executeStrategy(Rectangle rectangle1, Rectangle rectangle2)
    {
       return strategy.checkForCollisions(rectangle1, rectangle2);
    }
}
