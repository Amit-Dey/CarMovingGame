package com.CarMoving;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements ActionListener {
    Image background;
    Car car;
    int a=100,b=280;
    Timer timer;
    Board(){
        background = new ImageIcon("bg.jpg").getImage();
        car = new Car();
        addKeyListener(new Ka());
        timer = new Timer(5,this);
        timer.start();
        setFocusable(true);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(background,0,0,this);
        g.drawImage(car.carImage,car.x,b,this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    private class Ka extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            car.whenKeyPassed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            super.keyReleased(e);
            car.whenKeyReleased(e);
        }
    }
}
