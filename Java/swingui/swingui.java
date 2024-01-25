package com.swingui;

import javax.swing.*;
import java.awt.*;

public class swingui {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setTitle("My app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ImageIcon img = new ImageIcon("download.jfif");
        frame.setIconImage(img.getImage());

        frame.getContentPane().setBackground(new Color(65, 139, 150));
    }
}
