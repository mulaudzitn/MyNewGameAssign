package dropsDisplay;

import java.awt.*;

/**
 * Created by F3694941 on 2016/04/22.
 */
public interface DropsInterface {
    void updateRainDrops();
    Rectangle getBounds();
    void draw(Graphics2D g2);
}
