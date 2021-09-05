package com.CarMovingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Car {
    Image carImage,rightCarMoving,rightCarFixed,leftCarMoving,leftCarFixed;;
    int x=100;
    Car(){
        carImage = new ImageIcon("src/rightCar.png").getImage();
        rightCarFixed = new ImageIcon("src/rightCar.png").getImage();
        rightCarMoving = new ImageIcon("src/rightCar.gif").getImage();
        leftCarFixed = new ImageIcon("src/leftCar.png").getImage();
        leftCarMoving = new ImageIcon("src/leftCar.gif").getImage();
    }
    public void whenKeyPassed(KeyEvent e){
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_RIGHT){
            carImage=rightCarMoving;
            x+=10;
        }
        else if (code == KeyEvent.VK_LEFT){
            carImage=leftCarMoving;
            x-=10;
        }
    }
    public void whenKeyReleased(KeyEvent e){
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_RIGHT){
            carImage=rightCarFixed;
        }
        else if (code == KeyEvent.VK_LEFT){
            carImage=leftCarFixed;
        }
    }
}
