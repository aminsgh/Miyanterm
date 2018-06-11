package aut.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class NewDownloadFrame extends JFrame {
    private IDownloadingBtn eventListener;

    private MyFile file;
    private String pathSavedFile;
    private String typeOfDownload;
    private boolean booleanTypeOfDownload;
    private String statue;

    private JLabel labelURL = new JLabel("Download URL :");
    private JTextField textFieldURL = new JTextField(50);
    private JLabel labelSave = new JLabel("Save directory :");
    private JTextField textFieldSave = new JTextField(30);
    private JLabel labelFileName = new JLabel("File name :");
    private JTextField textFieldFileName = new JTextField(20);
    private JLabel labelFileSize = new JLabel("File size(Bytes) :");
    private JTextField textFieldFileSize = new JTextField(10);
    private JFileChooser fileChooser = new JFileChooser("C:\\Users\\amin_\\Desktop");
    private JButton download = new JButton("Download");
    private JButton brows = new JButton("brows");
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JRadioButton startNow;
    private JRadioButton addToQueues ;
    private ButtonGroup buttonGroup = new ButtonGroup();
    private JPanel panel = new JPanel();
    private String lookAndFeel;


    public NewDownloadFrame(SettingPack settingPack) {
        lookAndFeel=settingPack.getLookAndFeel();
        booleanTypeOfDownload=settingPack.getTypeOfDownload();
        typeOfDownload=settingPack.getTypeOfDownloadString();
        startNow = new JRadioButton("start now",settingPack.getTypeOfDownload());
        addToQueues= new JRadioButton("add to queues",!settingPack.getTypeOfDownload());
        ButtonListener buttonListener = new ButtonListener();
        RadioListener radioListener = new RadioListener();
        brows.addActionListener(buttonListener);
        download.addActionListener(buttonListener);
        startNow.addActionListener(radioListener);
        addToQueues.addActionListener(radioListener);
        buttonGroup.add(startNow);
        buttonGroup.add(addToQueues);
        panel.add(startNow);
        panel.add(addToQueues);
        tabbedPane.add("type of download", panel);

        GridBagLayout gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(labelFileName, constraints);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.weightx = 1.0;
        add(textFieldFileName, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(labelSave, constraints);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.weightx = 1.0;
        textFieldSave.setText(settingPack.getSavePath());
        pathSavedFile=settingPack.getSavePath();
        add(textFieldSave, constraints);

        constraints.gridx = 2;
        constraints.weightx = 1.0;
        add(brows, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        add(labelURL, constraints);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.weightx = 1.0;
        add(textFieldURL, constraints);

        constraints.gridx = 0;
        constraints.gridy=4 ;
        add(labelFileSize, constraints);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.weightx = 1.0;
        add(textFieldFileSize, constraints);

        constraints.gridx = 0;
        constraints.gridy =5;
        add(tabbedPane, constraints);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.weightx = 1.0;
        add(download, constraints);

        setTitle("new download");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }



    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(download)) {
                file = new MyFile(textFieldURL.getText(), textFieldFileName.getText(), pathSavedFile, textFieldFileSize.getText(),typeOfDownload);
                file.setURL(textFieldURL.getText());
                statue=typeOfDownload;
                file.setLookAndFeel(lookAndFeel);
                file.setStatus(statue);
                try {
                    eventListener.downloadClicked(file);
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                dispose();
            }
           if (e.getSource().equals(brows)) {
                fileChooser.setDialogTitle("save place");
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == fileChooser.APPROVE_OPTION) {
                    if (fileChooser.getSelectedFile().isDirectory()) {
                        pathSavedFile = fileChooser.getSelectedFile().getPath();
                        textFieldSave.setText(pathSavedFile);
                    }

                }
            }

        }

    }

    private class RadioListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (startNow.isSelected()) {
                typeOfDownload = "start now";
                statue="downloading";
            } else if (addToQueues.isSelected()) {
                typeOfDownload = "add to queues";
               statue="wait for queue";
            }


        }

    }

    public MyFile getFile() {
        return file;
    }


    public void setEventListener(IDownloadingBtn iEventListener) {
        this.eventListener = iEventListener;
    }
}
