package aut.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Gui {

    private JButton button1;
    private JButton button2;
    private JButton buttonAdd;
    private JButton button3;
    private JButton buttonSub;
    private JButton buttonE;
    private JButton button6;
    private JButton button4;
    private JButton button5;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonMul;
    private JButton button0;
    private JButton buttonDiv;
    private JButton buttonDel;
    private JPanel panel;
    private ArrayList<JButton> buttonsList;

    public Gui() {
        buttonsList=new ArrayList<>();
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        button1 = new JButton();
        button1.setText("1");
        buttonsList.add(0,button1);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button1, gbc);
        button2 = new JButton();
        button2.setText("2");
        buttonsList.add(1,button2);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button2, gbc);
        button3 = new JButton();
        button3.setText("3");
        buttonsList.add(2,button3);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button3, gbc);
        buttonAdd = new JButton();
        buttonAdd.setText("+");
        buttonsList.add(3,buttonAdd);//
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonAdd, gbc);
        button4 = new JButton();
        button4.setText("4");
        buttonsList.add(4,button4);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button4, gbc);
        button5 = new JButton();
        button5.setText("5");
        buttonsList.add(5,button5);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button5, gbc);
        button6 = new JButton();
        button6.setText("6");
        buttonsList.add(6,button6);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button6, gbc);
        buttonSub = new JButton();
        buttonSub.setText("-");
        buttonsList.add(7,buttonSub);//
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonSub, gbc);
        button7 = new JButton();
        button7.setText("7");
        buttonsList.add(8,button7);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button7, gbc);
        button8 = new JButton();
        button8.setText("8");
        buttonsList.add(9,button8);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button8, gbc);
        button9 = new JButton();
        button9.setText("9");
        buttonsList.add(10,button9);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button9, gbc);
        buttonMul = new JButton();
        buttonMul.setText("*");
        buttonsList.add(11,buttonMul);
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonMul, gbc);
        button0 = new JButton();
        button0.setText("0");
        buttonsList.add(12,button0);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(button0, gbc);
        buttonE = new JButton();
        buttonE.setText("=");
        buttonsList.add(13,buttonE);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonE, gbc);
        buttonDel = new JButton();
        buttonDel.setText("delete");
        buttonsList.add(14,buttonDel);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.weightx = 2.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonDel, gbc);
        buttonDiv = new JButton();
        buttonDiv.setText("/");
        buttonsList.add(15,buttonDiv);
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonDiv, gbc);


    }





    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public ArrayList<JButton> getButtonsList() {
        return buttonsList;
    }


}