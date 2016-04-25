package gameScreen;

import com.wits.edu.Elen7045.GameLevels.GameLevelFactory;
import com.wits.edu.Elen7045.GameLevels.GameLevelInterface;

/**
 * Created by Norman Mulaudzi on 2016/04/22.
 */


public class UpdateThread extends Thread {
    GamePanel panel;
    private GameLevelFactory gameLevelFactory = new GameLevelFactory();
    private GameLevelInterface gameLevel = gameLevelFactory.getGameLevel("Level1");

    public UpdateThread(GamePanel panel , GameLevelInterface gameLevel)
    {
        this.panel = panel;
        this.gameLevel =  gameLevel;

    }

    public volatile boolean stopped=false;
    @Override
    public void run() {
        while (!stopped) {
            panel.repaint();
            try {
                Thread.sleep(gameLevel.getDropRepaintTimeMS());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}