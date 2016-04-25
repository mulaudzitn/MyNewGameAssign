package com.wits.edu.Elen7045.GameLevels;



/**
 * Created by Norman Mulaudzi on 2016/04/18.
 */
public class GameLevelFactory {
    public GameLevelInterface getGameLevel(String level)
    {
        if (level == null) {
            return null;
        }
        if (level.equalsIgnoreCase("Level1")) {
            return new Level1();
        }
        return null;
    }
}
