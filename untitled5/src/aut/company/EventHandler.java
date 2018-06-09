package aut.company;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EventHandler extends Gui {
    private ArrayList<Integer> number1 = new ArrayList();
    private ArrayList<Integer> number2 = new ArrayList();
    private char operation;
    private boolean isSetNumber1 = false;
    private boolean isSetNumber2 = false;
    private JTextField textField = new JTextField();
    Gui gui;

    public EventHandler() {
        gui = new Gui();
        ButtonHandler buttonHandler = new ButtonHandler();
        textField.addActionListener(buttonHandler);
        for (JButton jButton : gui.getButtonsList()) {
            jButton.addActionListener(buttonHandler);

        }
    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!e.getSource().equals(gui.getButtonsList().get(3)) && !e.getSource().equals(gui.getButtonsList().get(7)) && !e.getSource().equals(gui.getButtonsList().get(11)) && !e.getSource().equals(gui.getButtonsList().get(15)) && !isSetNumber1 && !isSetNumber2) {
                setNumber(e, number1);

            } else if (!e.getSource().equals(gui.getButtonsList().get(3)) && !e.getSource().equals(gui.getButtonsList().get(7)) && !e.getSource().equals(gui.getButtonsList().get(11)) && !e.getSource().equals(gui.getButtonsList().get(15)) && isSetNumber1 && !isSetNumber2) {
                setNumber(e, number2);
            }

            if (e.getSource().equals(gui.getButtonsList().get(3))) {
                operation = '+';
                textField.setText(textField.getText() + "+");
            } else if (e.getSource().equals(gui.getButtonsList().get(7))) {
                operation = '-';
                textField.setText(textField.getText() + "-");
            } else if (e.getSource().equals(gui.getButtonsList().get(11))) {
                operation = '*';
                textField.setText(textField.getText() + "*");
            } else if (e.getSource().equals(gui.getButtonsList().get(15))) {
                operation = '/';
                textField.setText(textField.getText() + "/");
            } else if (e.getSource().equals(gui.getButtonsList().get(13))) {
                textField.setText(textField.getText() + "=");
                isSetNumber2 = true;
            }
            isSetNumber1 = true;

            if (e.getSource().equals(gui.getButtonsList().get(14))) {
                number1.clear();
                number2.clear();
                isSetNumber1 = false;
                isSetNumber2 = false;
                textField.setText("");
            }

        }
    }

    private void setNumber(ActionEvent e, ArrayList<Integer> number) {

        if (e.getSource().equals(gui.getButtonsList().get(0))) {
            number.add(1);
            textField.setText(textField.getText() + 1);
        } else if (e.getSource().equals(gui.getButtonsList().get(1))) {
            number.add(2);
            textField.setText(textField.getText() + 2);
        } else if (e.getSource().equals(gui.getButtonsList().get(2))) {
            number.add(3);
            textField.setText(textField.getText() + 3);
        } else if (e.getSource().equals(gui.getButtonsList().get(4))) {
            number.add(4);
            textField.setText(textField.getText() + 4);
        } else if (e.getSource().equals(gui.getButtonsList().get(5))) {
            number.add(5);
            textField.setText(textField.getText() + 5);
        } else if (e.getSource().equals(gui.getButtonsList().get(6))) {
            number.add(6);
            textField.setText(textField.getText() + 6);
        } else if (e.getSource().equals(gui.getButtonsList().get(8))) {
            number.add(7);
            textField.setText(textField.getText() + 7);
        } else if (e.getSource().equals(gui.getButtonsList().get(9))) {
            number.add(8);
            textField.setText(textField.getText() + 8);
        } else if (e.getSource().equals(gui.getButtonsList().get(10))) {
            number.add(9);
            textField.setText(textField.getText() + 9);
        } else if (e.getSource().equals(gui.getButtonsList().get(12))) {
            number.add(0);
            textField.setText(textField.getText() + 0);
        }

    }

    public JTextField getTextField() {
        return textField;
    }
}

