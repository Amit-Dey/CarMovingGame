package com.CarMovingGame;

import javax.swing.*;

public class Frame extends JFrame {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(628,390);
        frame.add(new Board());
        frame.setVisible(true);
    }

}
