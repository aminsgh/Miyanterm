package aut.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RemovedFrame extends JFrame {
    private JPanel panel = new JPanel();

    public RemovedFrame(ArrayList<MyFile> arrayList) throws HeadlessException {
        setTitle("Removed Download");
        panel.setLayout(new FlowLayout());
        for (MyFile myFile : arrayList) {
            panel.add(myFile.getDownloadPanel(),FlowLayout.LEFT);
        }
        panel.setBackground(Color.yellow);
        add(panel,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);

    }
}
