package com.wits.edu.Elen7045.GamePlayerControls;

import com.wits.edu.Elen7045.GameLevels.GameLevelFactory;
import com.wits.edu.Elen7045.GameLevels.GameLevelInterface;
import com.wits.edu.Elen7045.gameScreen.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by F3694941 on 2016/04/20.
 */
public class GameKeyListener implements KeyListener {
    private int current_X_Axis;
    private GameLevelFactory gameLevelFactory = new GameLevelFactory();
    private GameLevelInterface gameLevel = gameLevelFactory.getGameLevel("Level1");

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
          int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT)
        {

            current_X_Axis -=15 ;
            System.out.println("Moving Left");
        }
        if(key == KeyEvent.VK_RIGHT)
        {
            current_X_Axis +=15;
            System.out.println("Moving Right");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    public void setCurrent_X_Axis( int xAxis)
    {
        current_X_Axis = xAxis;
    }

    public int getCurrent_X_Axis()
    {
        return  current_X_Axis;
    }

}
