package com.wits.edu.Elen7045.GamePlayerControls;

import com.wits.edu.Elen7045.gamePlayer.PlayerFactory;
import com.wits.edu.Elen7045.gamePlayer.PlayerInterface;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by F3694941 on 2016/04/19.
 */
public class GameKeyAdapter extends KeyAdapter {
   // private PlayerFactory playerFactory3 = new PlayerFactory();
    //private PlayerInterface player3 = playerFactory3.getPlayer("HumanPlayer");
   private PlayerInterface player4;
     public GameKeyAdapter(PlayerInterface player3)
     {
         this.player4 = player3;
     }

        public void keyReleased() {
            keyReleased();
        }


        public void keyReleased(int e) {
            player4.keyReleased(e);
        }


        public void keyPressed(int e) {
            System.out.println("Pressing the key");
            player4.keyPressed(e);
        }
    }

