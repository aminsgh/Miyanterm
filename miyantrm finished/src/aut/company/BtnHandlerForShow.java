package aut.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class BtnHandlerForShow extends JPanel {
    private JButton queuesDownload = new JButton("queues list",new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyantrm finished\\queue.png"));
    private JButton allDownload = new JButton("all download",new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyantrm finished\\all.png"));
    private JButton completedDownload = new JButton("completed download",new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyantrm finished\\completed.png"));
    private JButton removedDownload=new JButton("removed Download");
    private JButton costumeSortButton =new JButton("costume sort ");
    private JButton searchingButton =new JButton("searching ");
    private JLabel label=new JLabel(new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyantrm finished\\logo.png"));

    private IShowButtonForAllDownload iShowButtonForAllDownload;
    private IShowButtonForQueue iShowButtonForQueue;
    private IShowButtonForCompletedDownload iShowButtonForCompletedDownload;
    private IShowButtonForRemoveDownload iShowButtonForRemoveDownload;
    private ICostumeSort iCostumeSort;
    private ISearching iSearching;

    public BtnHandlerForShow() {
        setBackground(Color.BLACK);
        GridBagLayout gridBagLayout=new GridBagLayout();
        GridBagConstraints constraints=new GridBagConstraints();
        BtnHandlerListenerForShow btnHandler=new BtnHandlerListenerForShow();
        queuesDownload.addActionListener(btnHandler);
        allDownload.addActionListener(btnHandler);
        completedDownload.addActionListener(btnHandler);
        removedDownload.addActionListener(btnHandler);
        costumeSortButton.addActionListener(btnHandler);
        searchingButton.addActionListener(btnHandler);
        setLayout(gridBagLayout);
        constraints.fill=GridBagConstraints.HORIZONTAL;
        constraints.gridx=0;
        constraints.gridy=0;
        add(label,constraints);
        constraints.gridy=1;
        add(allDownload,constraints);
        constraints.gridy=2;
        add(queuesDownload,constraints);
        constraints.gridy=3;
        add(completedDownload,constraints);
        constraints.gridy=4;
        add(removedDownload,constraints);
        constraints.gridy=5;
        add(costumeSortButton,constraints);
        constraints.gridy=6;
        add(searchingButton,constraints);
    }

    public void setIShowButtonForAllDownload(IShowButtonForAllDownload iShowButtonForAllDownload) {
        this.iShowButtonForAllDownload = iShowButtonForAllDownload;
    }

    public void setIShowButtonForQueue(IShowButtonForQueue iShowButtonForQueue) {
        this.iShowButtonForQueue = iShowButtonForQueue;
    }

    public void setIShowButtonForCompletedDownload(IShowButtonForCompletedDownload iShowButtonForCompletedDownload) {
        this.iShowButtonForCompletedDownload = iShowButtonForCompletedDownload;
    }
    public void setIShowButtonForRemoveDownload(IShowButtonForRemoveDownload iShowButtonForRemoveDownload){
        this.iShowButtonForRemoveDownload=iShowButtonForRemoveDownload;
    }
    public void setISearching(ISearching iSearching){
        this.iSearching= iSearching;
    }

    public void setICostumeSort(ICostumeSort iCostumeSort) {
        this.iCostumeSort = iCostumeSort;
    }

    private class BtnHandlerListenerForShow implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            allDownload.setBackground(Color.LIGHT_GRAY);
            completedDownload.setBackground(Color.LIGHT_GRAY);
            queuesDownload.setBackground(Color.LIGHT_GRAY);
            if (e.getSource().equals(allDownload)) {
                iShowButtonForAllDownload.showAllDownloadClicked();
                allDownload.setBackground(Color.DARK_GRAY);
            } else if (e.getSource().equals(completedDownload)) {
               iShowButtonForCompletedDownload.ShowCompletedDownloadClicked();
               completedDownload.setBackground(Color.DARK_GRAY);
            } else if (e.getSource().equals(queuesDownload)) {
               iShowButtonForQueue.showQueueDownloadClicked();
               queuesDownload.setBackground(Color.DARK_GRAY);
            }else if (e.getSource().equals(removedDownload)){
                try {
                    iShowButtonForRemoveDownload.removeDownloadClicked();
                    removedDownload.setBackground(Color.DARK_GRAY);
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource().equals(costumeSortButton)){
                iCostumeSort.iCostumeSortClick();
            }else if (e.getSource().equals(searchingButton)){
                iSearching.searchClicked();
            }


        }
    }
}
