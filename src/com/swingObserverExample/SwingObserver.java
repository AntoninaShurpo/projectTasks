package com.swingObserverExample;

import javax.swing.*;
import java.awt.*;

public class SwingObserver {
    JFrame frame;

    public static void main(String[] args){
        SwingObserver example= new SwingObserver();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do that?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
    }

}
