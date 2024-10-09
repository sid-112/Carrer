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

    KeyHandler keyH = new KeyHandler();

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    Thread gameTread;
    int PlayerX = 100;
    int PlayerY = 100;
    int PlayerSpeed = 4;

    @Override
    public void run(){
        while (gameTread != null){
            update();
            repaint();
        }
    }

    public void startGameThread(){
        gameTread = new Thread(this);
        gameTread.start();
    }

    public void update(){
        if (keyH.upPressed == true){
            PlayerY -=PlayerSpeed;
        } else if (keyH.downPressed == true) {
            PlayerY += PlayerSpeed;
        } else if (keyH.leftPressed == true) {
            PlayerX -= PlayerSpeed;
        } else if (keyH.rightPressed == true) {
            PlayerX += PlayerSpeed;
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D  g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.fillRect(PlayerX, PlayerY, Tilesize, Tilesize);
        g2.dispose();
    }

}
