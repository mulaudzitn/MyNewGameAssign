package com.wits.edu.Elen7045.gamePlayer;
import com.wits.edu.Elen7045.Rain.Rain;
import com.wits.edu.Elen7045.gameScreen.GamePanel;
/**
 * Created by Norman Mulaudzi on 2016/04/18.
 */
public class PlayerFactory {
    private GamePanel gamePanel;
    public PlayerInterface getPlayer(String playerType) {
        if (playerType == null) {
            return null;
        }
        if (playerType.equalsIgnoreCase("RectangularPlayer")) {
            return new RectangularPlayer();
        }
        return null;
    }
}
