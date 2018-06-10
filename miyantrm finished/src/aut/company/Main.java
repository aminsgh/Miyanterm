package aut.company;

import aut.company.intenet.MyURLConnection;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	// write your code here
        JFrame frame = new JFrame("download manager");
        EventHandlerForAllOption eventHandlerForAllOption = new EventHandlerForAllOption();
        frame.setJMenuBar(eventHandlerForAllOption.getMenuHandler().getJMenuBar());
        frame.setPreferredSize(new Dimension(500,500));
        frame.add(eventHandlerForAllOption.getScrollBar(),BorderLayout.EAST);
        frame.add(eventHandlerForAllOption.getBtnHandler(),BorderLayout.NORTH);
        frame.add(eventHandlerForAllOption.getBtnHandlerForShow(),BorderLayout.WEST);
        frame.add(eventHandlerForAllOption,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
