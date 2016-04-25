package com.wits.edu.Elen7045.Rain;

import com.wits.edu.Elen7045.gamePlayer.PlayerInterface;
import com.wits.edu.Elen7045.gamePlayer.RectangularPlayer;

/**
 * Created by Norman Mulaudzi on 2016/04/26.
 */


public class RainFactory {
    public RainInterface getRain(String rainType) {
        if (rainType== null) {
            return null;
        }
        if (rainType.equalsIgnoreCase("Umbrella")) {
            return new Umbrella();
        } else
           if (rainType.equalsIgnoreCase("Rain"))
               return new Rain();
        return null;
    }
}
