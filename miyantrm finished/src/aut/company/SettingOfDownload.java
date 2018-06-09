package aut.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class SettingOfDownload extends JFrame {
    private SettingPack settingPack;
    private IChangeSetting changeSetting;

    private JButton brows = new JButton("brows");
    private JButton setSetting = new JButton("ok");
    private JLabel labelSavePath = new JLabel("save path(default for download) :");
    private JTextField textFieldSavePath = new JTextField("C:\\Users\\amin_\\Desktop",20);
    private JFileChooser fileChooser = new JFileChooser("C:\\Users\\amin_\\Desktop");
    private JRadioButton startNow;
    private JRadioButton addToQueues;

    private JRadioButton lookAndFeelWindowsClassic;
    private JRadioButton lookAndFeelWindows;
    private JRadioButton lookAndFeelCDEMotif;
    private JRadioButton lookAndFeelNimbus;
    private JRadioButton lookAndFeelMetal;
    private ButtonGroup buttonGroupForLookAndFeel = new ButtonGroup();


    private ButtonGroup buttonGroup = new ButtonGroup();
    private JPanel panel = new JPanel();
    private JPanel radioPanel = new JPanel();
    private JPanel radioPanelForLAF = new JPanel();
    private JTabbedPane jTabbedPane = new JTabbedPane();

    private JLabel limitedDownloadLabel=new JLabel("limited downloading :");
    private SpinnerModel spinnerModel=new SpinnerNumberModel(0,0,10,1);
    private JSpinner limitedDownloadSpinner=new JSpinner(spinnerModel);

    private JRadioButton sortByName=new JRadioButton("name",true);
    private JRadioButton sortByDateAndTime=new JRadioButton("Date and time");
    private JRadioButton sortBySize=new JRadioButton("size");
    private ButtonGroup buttonGroupSort=new ButtonGroup();
    private JPanel radioPanelForSort=new JPanel();

    private JLabel searchLabel=new JLabel("search string :");
    private TextField searchTextField =new TextField(10);

    private String savePath = "C:\\Users\\amin_\\Desktop";
    private String lookAndFeel = "Windows";
    private int finalLimitedDownload=0;
    private String sortBy="name";
    private boolean typeOfDownload;



    public SettingOfDownload() {
        RadioListener radioListener = new RadioListener();
        SpinnerHandler spinnerHandler=new SpinnerHandler();
        limitedDownloadSpinner.addChangeListener(spinnerHandler);
        lookAndFeelWindowsClassic = new JRadioButton("Windows Classic");
        lookAndFeelWindows = new JRadioButton("Windows", true);
        lookAndFeelCDEMotif = new JRadioButton("CDE/Motif");
        lookAndFeelNimbus = new JRadioButton("Nimbus");
        lookAndFeelMetal = new JRadioButton("Metal");
        lookAndFeelWindowsClassic = new JRadioButton("Windows Classic");
        lookAndFeelWindows.addActionListener(radioListener);
        lookAndFeelWindowsClassic.addActionListener(radioListener);
        lookAndFeelCDEMotif.addActionListener(radioListener);
        lookAndFeelNimbus.addActionListener(radioListener);
        lookAndFeelMetal.addActionListener(radioListener);
        buttonGroupForLookAndFeel.add(lookAndFeelWindowsClassic);
        buttonGroupForLookAndFeel.add(lookAndFeelWindows);
        buttonGroupForLookAndFeel.add(lookAndFeelCDEMotif);
        buttonGroupForLookAndFeel.add(lookAndFeelNimbus);
        buttonGroupForLookAndFeel.add(lookAndFeelMetal);
        sortByName.addActionListener(radioListener);
        sortByDateAndTime.addActionListener(radioListener);
        sortBySize.addActionListener(radioListener);
        buttonGroupSort.add(sortByName);
        buttonGroupSort.add(sortByDateAndTime);
        buttonGroupSort.add(sortBySize);


        startNow = new JRadioButton("start now", true);
        addToQueues = new JRadioButton("add to queues");
        ButtonListener buttonListener = new ButtonListener();
        brows.addActionListener(buttonListener);
        setSetting.addActionListener(buttonListener);
        startNow.addActionListener(radioListener);
        addToQueues.addActionListener(radioListener);

        radioPanel.setLayout(new FlowLayout());
        radioPanelForLAF.setLayout(new FlowLayout());
        radioPanelForSort.setLayout(new FlowLayout());

        radioPanel.add(startNow);
        radioPanel.add(addToQueues);

        radioPanelForLAF.add(lookAndFeelWindowsClassic);
        radioPanelForLAF.add(lookAndFeelWindows);
        radioPanelForLAF.add(lookAndFeelCDEMotif);
        radioPanelForLAF.add(lookAndFeelNimbus);
        radioPanelForLAF.add(lookAndFeelMetal);

        radioPanelForSort.add(sortByName);
        radioPanelForSort.add(sortByDateAndTime);
        radioPanelForSort.add(sortBySize);

        jTabbedPane.add("type of download", radioPanel);
        jTabbedPane.add("set look and feel", radioPanelForLAF);
        jTabbedPane.add("set costume sort",radioPanelForSort);

        buttonGroup.add(startNow);
        buttonGroup.add(addToQueues);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
      constraints.insets = new Insets(5, 5, 5, 5);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.setLayout(gridBagLayout);

        constraints.gridy = 0;
        constraints.gridx = 0;
        panel.add(labelSavePath, constraints);
        constraints.gridx = 1;
        panel.add(textFieldSavePath);
        constraints.gridx = 2;
        panel.add(brows, constraints);
        constraints.gridy = 1;
        constraints.gridx = 0;
        panel.add(limitedDownloadLabel,constraints);
        constraints.gridx=1;
        panel.add(limitedDownloadSpinner,constraints);
        constraints.gridy = 2;
        constraints.gridx = 0;
        panel.add(searchLabel,constraints);
        constraints.gridx=1;
        panel.add(searchTextField,constraints);
        constraints.gridy = 3;
        constraints.gridx = 0;
        panel.add(jTabbedPane, constraints);
        constraints.gridy = 3;
        constraints.gridx = 2;
        panel.add(setSetting, constraints);

        setName("setting");
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public boolean getTypeOfDownload() {
        return typeOfDownload;
    }

    public void setTypeOfDownload(boolean typeOfDownload) {
        this.typeOfDownload = typeOfDownload;
    }

    public void setChangeSettingListener(IChangeSetting changeSetting) {
        this.changeSetting = changeSetting;
    }

    public SettingPack getSettingPack() {
        return settingPack;
    }

    public void setSettingPack(SettingPack settingPack) {
        this.settingPack = settingPack;
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(brows)) {
                fileChooser.setDialogTitle("default save for download");
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == fileChooser.APPROVE_OPTION) {
                    if (fileChooser.getSelectedFile().isDirectory()) {
                        savePath = fileChooser.getSelectedFile().getPath();
                        textFieldSavePath.setText(savePath);
                    }

                }
            }
            if (e.getSource().equals(setSetting)) {
                settingPack = new SettingPack(savePath, lookAndFeel, typeOfDownload,finalLimitedDownload,sortBy,searchTextField.getText());
                try {
                    changeSetting.okClicked(settingPack);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                dispose();
            }
        }
    }

    private class RadioListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(startNow)) {
                typeOfDownload = true;
            } else if (e.getSource().equals(addToQueues)) {
                typeOfDownload = false;
            }
            if (e.getSource().equals(lookAndFeelWindowsClassic)) {
                lookAndFeel = "Windows Classic";
            } else if (e.getSource().equals(lookAndFeelWindows)) {
                lookAndFeel = "Windows";
            } else if (e.getSource().equals(lookAndFeelCDEMotif)) {
                lookAndFeel = "CDE/Motif";
            } else if (e.getSource().equals(lookAndFeelCDEMotif)) {
                lookAndFeel = "Nimbus";
            } else if (e.getSource().equals(lookAndFeelMetal)) {
                lookAndFeel = "Metal";
            }
            if (e.getSource().equals(sortByName)){
                sortBy="name";
            }else if (e.getSource().equals(sortByDateAndTime)){
                sortBy="time";
            }else if (e.getSource().equals(sortBySize)){
                sortBy="size";
            }

        }

    }
    public class SpinnerHandler implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
          finalLimitedDownload= (int) ((JSpinner)e.getSource()).getValue();
        }
    }

}