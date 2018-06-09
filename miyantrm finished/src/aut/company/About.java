package aut.company;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    private JLabel name =new JLabel("name :") ;
    private JLabel size=new JLabel("size :") ;
    private JLabel date=new JLabel("date :");
    private JPanel pane=new JPanel();

    public About(MyFile myFile) {
        pane.setLayout(new FlowLayout());
        name.setText(name.getText()+myFile.getNameFile());
        size.setText(size.getText()+myFile.getSavePath());
        date.setText(date.getText()+myFile.getNameFile());
        pane.add(name,FlowLayout.LEFT);
        pane.add(size,FlowLayout.LEFT);
        pane.add(date,FlowLayout.LEFT);
        add(pane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
