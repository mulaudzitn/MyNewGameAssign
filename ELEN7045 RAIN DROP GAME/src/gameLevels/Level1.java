package gameLevels;
import gameLevels.GameLevelInterface;

import java.awt.Color;
/**
 * Created by Norman Mulaudzi on 2016/04/18.
 */


public class Level1 implements GameLevelInterface {
    private float windSpeed;
    private float gravitySpeed;
    private double rainChance; // from 0 to 1
    private int panelSize;
    private int dropRepaintTimeMS;
    private float RainWidth;
    private double dropInitialVelocity;
    private double dropDiameter;
    private Color dropColor;
    private int x_PlayerPosition;
    private int y_PlayerPosition;

    private int panelWidth;
    private int panelHeight;

    // default values

    private final float WINDSPEED = 2.05f;
    private final float GRAVITYSPEED = 9.8f;
    private final double RAINCHANCE = 0.09;

    private final int PANELSIZE = 600;
    private final int PANELWIDTH = 800;
    private final int PANELHEIGHT = 800;

    private final int DROPREPAINTTIMESMILLISECONDS = 30;
    private final float RAINWIDTH = 1;
    private final double DROPINITIALVELOCITY = 20;
    private final double DROPDIAMETER = 5;
    private final Color DROPCOLOR = new Color(0, 0, 255);
    private final int HORIZONTAL_PLAYER_POSITION = 0;
    private final int VERTICAL_PLAYER_POSITION = 745;

    public Level1() {
        setLevel1();
    }

    public void setLevel1() {
        // TODO Auto-generated method stub
        setWindSpeed(WINDSPEED);
        setGravitySpeed(GRAVITYSPEED);
        setRainChance(RAINCHANCE);
        //
        setDropRepaintTimeMS(DROPREPAINTTIMESMILLISECONDS);
        setRainWidth(RAINWIDTH);
        setDropInitialVelocity(DROPINITIALVELOCITY);
        setDropDiameter(DROPDIAMETER);
        setDropColor(DROPCOLOR);
        setPanelSize(PANELSIZE);
        setX_playerPosition(HORIZONTAL_PLAYER_POSITION);
        setFinal_Y_PlayerPosition(VERTICAL_PLAYER_POSITION);
        setPanelWidth(PANELWIDTH);
        setPanelHeight(PANELHEIGHT);
    }


    public float getWindSpeed() {
        return windSpeed;
    }


    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }


    public float getGravitySpeed() {
        return gravitySpeed;
    }


    public void setGravitySpeed(float gravitySpeed) {
        this.gravitySpeed = gravitySpeed;
    }


    public double getRainChance() {
        return rainChance;
    }


    public void setRainChance(double rainChance) {
        this.rainChance = rainChance;
    }


    public int getDropRepaintTimeMS() {
        return dropRepaintTimeMS;
    }


    public void setDropRepaintTimeMS(int dropRepaintTimeMS) {
        this.dropRepaintTimeMS = dropRepaintTimeMS;
    }


    public float getRainWidth() {
        return RainWidth;
    }


    public void setRainWidth(float rainWidth) {
        RainWidth = rainWidth;
    }


    public double getDropInitialVelocity() {
        return dropInitialVelocity;
    }


    public void setDropInitialVelocity(double dropInitialVelocity) {
        this.dropInitialVelocity = dropInitialVelocity;
    }


    public double getDropDiameter() {
        return dropDiameter;
    }


    public void setDropDiameter(double dropDiameter) {
        this.dropDiameter = dropDiameter;
    }


    public Color getDropColor() {
        return dropColor;
    }


    public void setDropColor(Color dropColor) {
        this.dropColor = dropColor;
    }

    public int getPanelSize() {
        return panelSize;
    }

    public void setPanelSize(int size) {
        this.panelSize = size;
    }

    public void setX_playerPosition(int x_playerPosition) {
        this.x_PlayerPosition = x_playerPosition;
    }

    public void setFinal_Y_PlayerPosition(int y_playerPosition) {
        y_PlayerPosition = y_playerPosition;
    }
   public int get_X_PlayerPosition()

   {
       return x_PlayerPosition;
   }

    public int getFinal_Y_PlayerPosition()
    {
        return y_PlayerPosition;
    }

     public void setPanelWidth( int width)
     {
         panelWidth = width;
     }
     public int getPanelWidth()
     {
         return panelWidth;
     }
    public void setPanelHeight( int height)
    {
        panelHeight = height;
    }
    public int getPanelHeight()
    {
        return panelHeight;
    }

    public int getPanel_Left_Limit()
    {
        return 0;
    }
    public int getPanel_Right_Limit()
    {
        return getPanelWidth() ;
    }
}
