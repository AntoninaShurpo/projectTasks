package com.templateMethod;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    String message;

    public void init() {
        message = "Hello, I'm alive";
        repaint();
    }

    public void start() {
        message = "Now I'm staring...";
        repaint();
    }

    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    public void destroy() {

    }

    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }

}
