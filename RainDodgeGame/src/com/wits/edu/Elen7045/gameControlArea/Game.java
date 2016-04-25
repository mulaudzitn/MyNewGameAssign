package com.wits.edu.Elen7045.gameControlArea;

/**
 * Created by Norman Mulaudzi on 2016/04/22.
 */

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}