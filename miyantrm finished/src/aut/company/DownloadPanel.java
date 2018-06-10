package aut.company;

import aut.company.intenet.MyURLConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DownloadPanel extends JPanel {
    private JPanel finalPanel;
    private JLabel fileName = new JLabel("File name :");
    private JLabel fileSize = new JLabel("File size(byte) :");
    private JLabel status = new JLabel("status :");
    private JLabel savePath = new JLabel("File save directory :");
    private JLabel dateAndTime=new JLabel("date and time :");
    private JLabel URL = new JLabel("URL :");


    private JButton open = new JButton(new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyanterm\\open.png"));
    private JButton resume = new JButton(new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyanterm\\resume.png"));
    private JButton cancel = new JButton(new ImageIcon("C:\\Users\\amin_\\IdeaProjects\\miyanterm\\cancel.png"));

    private JProgressBar progressBar = new JProgressBar(0, 100);

    private JPanel panelDownload = new JPanel();
    private JPanel panelInformation = new JPanel();

    private MyFile myFile;

    private MyURLConnection myURLConnection;

    private JTabbedPane jTabbedPane = new JTabbedPane();

    public DownloadPanel(MyFile file) throws IOException {
        ButtonHandler buttonHandler=new ButtonHandler();
        open.addActionListener(buttonHandler);
        cancel.addActionListener(buttonHandler);
        resume.addActionListener(buttonHandler);
        this.myFile=file;
        finalPanel = new JPanel();
        progressBar.setValue(1);
        cancel.setPreferredSize(new Dimension(20, 20));
        open.setPreferredSize(new Dimension(20, 20));
        resume.setPreferredSize(new Dimension(20, 20));

        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        panelDownload.setLayout(gridBagLayout);
        constraints.gridy = 0;
        constraints.gridx = 0;
        panelDownload.add(fileName, constraints);
        constraints.gridy = 2;
        constraints.gridx = 0;
        panelDownload.add(resume, constraints);
        constraints.gridx = 1;
        panelDownload.add(open, constraints);
        constraints.gridx = 2;
        constraints.gridwidth = 1;
        panelDownload.add(cancel, constraints);
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.gridwidth = 10;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        panelDownload.add(progressBar, constraints);
        progressBar.setStringPainted(true);
        panelInformation.setLayout(gridBagLayout);
        panelDownload.setLayout(gridBagLayout);
        constraints.gridy = 0;
        constraints.gridx = 0;
        fileName.setText(fileName.getText() + myFile.getNameFile());
        panelInformation.add(fileName, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        fileSize.setText(fileSize.getText() + file.getSize());
        panelInformation.add(fileSize, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        status.setText(status.getText() + file.getStatus());
        panelInformation.add(status, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        URL.setText(URL.getText() + file.getURL());
        panelInformation.add(URL, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        dateAndTime.setText(dateAndTime.getText()+file.getTime());
        panelInformation.add(dateAndTime,constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;
        savePath.setText(savePath.getText() + file.getSavePath());
        panelInformation.add(savePath, constraints);

        panelDownload.setBackground(Color.GRAY);
        panelInformation.setBackground(Color.GRAY);
        jTabbedPane.add("Download", panelDownload);
        jTabbedPane.add("Information", panelInformation);
        setLayout(gridBagLayout);
        constraints.gridx=0;
        constraints.gridy=0;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        add(jTabbedPane,constraints);


    }
    public void checkDownloadIsFinish(){
        if (progressBar.getValue()==100){
            myFile.setFinished(true);
        }
    }

    public JPanel getFinalPanel() {
        return finalPanel;
    }

    public MyFile getMyFile() {
        return myFile;
    }

    public int getProgressBarPercent() {
        return progressBar.getValue();
    }

    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(open)) {
                System.out.println(open);
                status.setText("status :opening");
                progressBar.setValue(100);
            }
            if (e.getSource().equals(cancel)) {

                System.out.println(cancel);
                    myFile.setStatus("canceled");
                    status.setText("status :cancel");
                    myFile.setFinished(true);
            }
            if (e.getSource().equals(resume)) {
                System.out.println("resume");
                myFile.setStatus("Downloading");
                status.setText("status :downloading");
                try {
                    myURLConnection=new MyURLConnection(myFile);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                checkDownloadIsFinish();
            }

            checkDownloadIsFinish();

        }
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }

    public void setStatus(String s){
        status.setText(s);
    }

    public void setProgressBarPercent(double percent) {
        this.progressBar.setValue(((int) percent)*100);
    }

    public void setFinalPanel(JPanel finalPanel) {
        this.finalPanel = finalPanel;
    }

    public JLabel getFileName() {
        return fileName;
    }

    public void setFileName(JLabel fileName) {
        this.fileName = fileName;
    }

    public JLabel getFileSize() {
        return fileSize;
    }

    public void setFileSize(JLabel fileSize) {
        this.fileSize = fileSize;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

    public JLabel getSavePath() {
        return savePath;
    }

    public void setSavePath(JLabel savePath) {
        this.savePath = savePath;
    }

    public JLabel getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(JLabel dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public JLabel getURL() {
        return URL;
    }

    public void setURL(JLabel URL) {
        this.URL = URL;
    }

    public JButton getOpen() {
        return open;
    }

    public void setOpen(JButton open) {
        this.open = open;
    }

    public JButton getResume() {
        return resume;
    }

    public void setResume(JButton resume) {
        this.resume = resume;
    }

    public JButton getCancel() {
        return cancel;
    }

    public void setCancel(JButton cancel) {
        this.cancel = cancel;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public JPanel getPanelDownload() {
        return panelDownload;
    }

    public void setPanelDownload(JPanel panelDownload) {
        this.panelDownload = panelDownload;
    }

    public JPanel getPanelInformation() {
        return panelInformation;
    }

    public void setPanelInformation(JPanel panelInformation) {
        this.panelInformation = panelInformation;
    }

    public void setMyFile(MyFile myFile) {
        this.myFile = myFile;
    }

    public MyURLConnection getMyURLConnection() {
        return myURLConnection;
    }

    public void setMyURLConnection(MyURLConnection myURLConnection) {
        this.myURLConnection = myURLConnection;
    }

    public JTabbedPane getjTabbedPane() {
        return jTabbedPane;
    }

    public void setjTabbedPane(JTabbedPane jTabbedPane) {
        this.jTabbedPane = jTabbedPane;
    }
}
