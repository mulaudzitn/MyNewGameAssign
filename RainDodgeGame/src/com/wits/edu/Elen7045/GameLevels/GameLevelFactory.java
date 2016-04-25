package com.wits.edu.Elen7045.GameLevels;



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
