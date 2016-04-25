package gameScreen;
import com.wits.edu.Elen7045.gameScreen.GamePanel;

import java.awt.event.*;
import javax.swing.*;

import static java.lang.System.exit;

public class Main {


public static void main(String[] args) {
	// write your code here

        JFrame frame = new JFrame("Rain Dodge Game ");
        frame.setSize(800, 800);
        final GamePanel rPanel=new GamePanel();
        frame.add(rPanel);
        frame.setVisible( true );
        frame.setResizable(false);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                rPanel.stop();
                System.exit(0);
            }
        });
    }
    }





