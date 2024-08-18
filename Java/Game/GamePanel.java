package com.Game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    final int orignalTileSize = 16;
    final int scale = 3;
    final int Tilesize = orignalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = Tilesize *  maxScreenCol;
    final int screenHeight = Tilesize *  maxScreenRow;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    Thread gameTread;


    @Override
    public void run(){

    }

    public void startGameThread(){
        gameTread = new Thread(this);
        gameTread.start();
    }
}
