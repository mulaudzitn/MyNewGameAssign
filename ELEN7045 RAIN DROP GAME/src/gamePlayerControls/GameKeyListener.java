package gamePlayerControls;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Norman Mulaudzi on 2016/04/20.
 */
public class GameKeyListener implements KeyListener {
    private int current_X_Axis = 350;
    //   private GameLevelFactory gameLevelFactory = new GameLevelFactory();
    //   private GameLevelInterface gameLevel = gameLevelFactory.getGameLevel("Level1");

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
          int key = e.getKeyCode();
        //Moving player to the left
        if(key == KeyEvent.VK_LEFT)
        {

            current_X_Axis -=15 ;

        }
        // moving player to the right
        if(key == KeyEvent.VK_RIGHT)
        {
            current_X_Axis +=15;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public int getCurrent_X_Axis()
    {
        return  current_X_Axis;
    }

    public void setCurrent_X_Axis(int xAxis) {
        current_X_Axis = xAxis;
    }

}
