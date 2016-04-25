package com.wits.edu.Elen7045.gameScreen;

import com.wits.edu.Elen7045.GameLevels.GameLevelFactory;
import com.wits.edu.Elen7045.Rain.Rain;
import com.wits.edu.Elen7045.RainDrops.Drop;
import com.wits.edu.Elen7045.gameCollisionDetector.CollissionsContext;
import com.wits.edu.Elen7045.gameCollisionDetector.DestructiveCollisions;
import com.wits.edu.Elen7045.gamePlayer.RectangularPlayer;
import com.wits.edu.Elen7045.gamePlayer.PlayerFactory;
import com.wits.edu.Elen7045.gamePlayer.PlayerInterface;
import com.wits.edu.Elen7045.GameLevels.*;
import com.wits.edu.Elen7045.GamePlayerControls.*;

import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Norman Mulaudzi on 2016/04/18.
 */

public class GamePanel extends JPanel {
    //*********SETTINGS****************************


    /*
        {
            player = playerFactory.getPlayer("RectangularPlayer");
        }
    */

    private JLabel gameLabel = new JLabel();;
    private CollissionsContext context;
    private boolean hasCollissionOccured = false;


    private GameKeyListener keyControl = new GameKeyListener();

    private GameLevelFactory gameLevelFactory = new GameLevelFactory();
    private GameLevelInterface gameLevel = gameLevelFactory.getGameLevel("Level1");
    private PlayerFactory playerFactory = new PlayerFactory();
    private PlayerInterface player = playerFactory.getPlayer("RectangularPlayer");
    private Rectangle rainRectangle;
    private Rain rain = new Rain();

//*********************************************

    private ArrayList<Rain> rainV;
    private ArrayList<Drop> dropV;
    private UpdateThread mUpdateThread;

    public GamePanel() {
        rainV = new ArrayList<>();
        dropV = new ArrayList<>();

        addKeyListener(keyControl);
        setBackground(Color.BLACK);
        gameLabel.setVerticalTextPosition(JLabel.TOP);
        gameLabel.setText("Testing JLabel");
        add(gameLabel);
        RectangularPlayer player = new RectangularPlayer();
        context = new CollissionsContext(new DestructiveCollisions());
        mUpdateThread = new UpdateThread(this, gameLevel);
        mUpdateThread.start();

    }

    public void stop() {
        mUpdateThread.stopped = true;
    }

    public int getHeight() {
        return this.getSize().height;
    }

    public int getWidth() {
        return this.getSize().width;
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g1 = (Graphics2D) g;
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        setGameScreenColor(g2);
        drawPlayerOnScreen(g2);


        //DRAW DROPS
        drawDropsOnScreen(g1);

      //  hasCollissionOccured = context.executeStrategy(rain.getBounds(), player.getBounds());
        //DRAW RAIN
        drawRain(g2);

    }


    // this method is for the keyboard input to be focusable
    public boolean isFocusable() {
        return true;
    }


    private void gameplayOver() {
        JOptionPane.showMessageDialog(this, "Game Over", "Game Over",
                JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

    void drawDropsOnScreen(Graphics2D g2) {
        Iterator<Drop> dropIterator = dropV.iterator();
        while (dropIterator.hasNext()) {
            Drop drop = dropIterator.next();
            drop.updateRainDrops();
            drop.draw(g2);

            if (drop.getY() >= getHeight()) {
                dropIterator.remove();
            }
        }

    }
     public  void drawRain(Graphics2D g2)
     {
    Iterator<Rain> rainIterator = rainV.iterator();
    while (rainIterator.hasNext()) {
        Rain rain = rainIterator.next();
        rain.updateRain();
        rainRectangle = rain.getBounds();
      //  hasCollissionOccured = player.isPlayerRainDropCollide( rainRectangle);
        rain.drawRain(g2);

        if (rain.getY() >= getHeight()) {
            //create new drops (2-8)
            long dropCount = 1 + Math.round(Math.random() * 4);
            for (int i = 0; i < dropCount; i++) {
                dropV.add(new Drop(rain.getX(), getHeight()));
            }
            rainIterator.remove();

        }
        //check for player and raindrop collissions
  //            hasCollissionOccured = context.executeStrategy(rain.getBounds(), player.getBounds());


    }

    //CREATE NEW RAIN
    if (Math.random() < gameLevel.getRainChance()) {
        rainV.add(new Rain());
    }

      processKeyListenerInput();

}

 //   public boolean isPlayerRainDropCollide()
 //   {
  //      return hasCollissionOccured = context.executeStrategy(rain.getBounds(),player.getBounds() );
 //   }

    public void processKeyListenerInput()
    {
        keyControl.getCurrent_X_Axis();
        player.setPlayerPosition_X_Axis(keyControl.getCurrent_X_Axis());
        player.CorrectPlayerHorizontalBounds();
    }

    public void drawPlayerOnScreen(Graphics2D g2)
    {
        player.draw(g2);
    }

    public void setGameScreenColor(Graphics2D g2)
    {
        g2.setColor(gameLevel.getDropColor());
    }
}
