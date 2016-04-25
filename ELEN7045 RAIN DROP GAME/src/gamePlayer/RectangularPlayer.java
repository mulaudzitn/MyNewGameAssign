package gamePlayer;
import com.wits.edu.Elen7045.GameLevels.GameLevelFactory;
import com.wits.edu.Elen7045.GameLevels.GameLevelInterface;
import com.wits.edu.Elen7045.GamePlayerControls.GameKeyListener;
import com.wits.edu.Elen7045.Rain.Rain;
import com.wits.edu.Elen7045.gameCollisionDetector.CollissionsContext;
import com.wits.edu.Elen7045.gameScreen.GamePanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

/**
 * Created by Norman Mulaudzi on 2016/04/18.
 */
public class RectangularPlayer implements PlayerInterface {
    private int previousPlayer_Position_X_Axis;
    private int playerPosition_X_Axis;
    private int playerPosition_Y_Axis;
    private int horizontalMovement;
    private GameLevelFactory gameLevelFactory = new GameLevelFactory();
    private GameLevelInterface gameLevel = gameLevelFactory.getGameLevel("Level1");
    private Color playerColor = Color.BLUE;
    private Rectangle rainRectangle;
    private CollissionsContext context;
    private boolean hasCollissionOccured;
    public RectangularPlayer() {

          this.rainRectangle = rainRectangle;
        //
        playerPosition_X_Axis = gameLevel.get_X_PlayerPosition();


    }


    // @Override
    public void paint(Graphics2D g) {
        g.setColor(playerColor);

        g.fillRect(playerPosition_X_Axis, playerPosition_Y_Axis
                , 20, 20); //

    }

    public void setPlayerPosition_X_Axis(int playerPosition_X_Axis) {
        this.playerPosition_X_Axis = playerPosition_X_Axis;
    }

    public int getPlayerPosition_X_Axis() {
        return playerPosition_X_Axis;
    }


    //@Override
    public Rectangle getBounds() {
        return new Rectangle(playerPosition_X_Axis,
                playerPosition_Y_Axis,
                20,
                20);
    }

    public void CorrectPlayerHorizontalBounds() {

        if (playerPosition_X_Axis >= 800) {
            playerPosition_X_Axis = 775;
        }
        if (playerPosition_X_Axis <= 0) {
            playerPosition_X_Axis = 1;
        }


    }

    public void draw(Graphics2D g2) {

        g2.fillRect(playerPosition_X_Axis, gameLevel.getFinal_Y_PlayerPosition(), 20, 20);
        //   System.out.println("Player X Position" + playerPosition_X_Axis );

    }
    public boolean isPlayerRainDropCollide(Rectangle rainRectangle)
    {
        return hasCollissionOccured = context.executeStrategy(rainRectangle.getBounds(),this.getBounds() );
    }
}



