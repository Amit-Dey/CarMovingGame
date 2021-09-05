package com.CarMovingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel{
    Image background;
    Car car;
    int a=100,b=280;
    Board(){
        background = new ImageIcon("src/bg.jpg").getImage();
        car = new Car();
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                car.whenKeyPassed(e);
            }
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                car.whenKeyReleased(e);
            }
        });
        setFocusable(true);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(background,0,0,this);
        g.drawImage(car.carImage,car.x,b,this);
        repaint();
    }

}
