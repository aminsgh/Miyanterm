package aut.company;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.CENTER;

public class Main {
    public static void main (String[] args){
        EventHandler eventHandler=new EventHandler();
        JFrame frame = new JFrame("Gui");
        frame.add(eventHandler.getTextField(),BorderLayout.NORTH);
        frame.add(eventHandler.gui.getPanel(), CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
