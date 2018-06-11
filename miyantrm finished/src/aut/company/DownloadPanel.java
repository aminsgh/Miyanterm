package aut.company;

import aut.company.intenet.MyURLConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

    /**
     * this is constructor
     * @param file
     * @throws IOException
     */
    public DownloadPanel(MyFile file) throws IOException {
        ButtonHandler buttonHandler=new ButtonHandler();
        MouseHandler mouseHandler=new MouseHandler();
        jTabbedPane.addMouseListener(mouseHandler);
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

    /**
     * check the download is finished or not
     */
    public void checkDownloadIsFinish(){
        if (progressBar.getValue()==100){
            myFile.setFinished(true);
        }
    }

    /**
     *
     * @return  final panel
     */
    public JPanel getFinalPanel() {
        return finalPanel;
    }

    /**
     *
     * @return myfile of download panel
     */
    public MyFile getMyFile() {
        return myFile;
    }

    /**
     *
     * @return value of progressBar
     */
    public int getProgressBarPercent() {
        return progressBar.getValue();
    }

    /**
     * set status
     * @param s
     */
    public void setStatus(String s){
        status.setText(s);
    }

    /**
     * set percent of progressBar
     * @param percent
     */
    public void setProgressBarPercent(double percent) {
        this.progressBar.setValue(((int) percent));
    }

    /**
     *
     * @param finalPanel
     */
    public void setFinalPanel(JPanel finalPanel) {
        this.finalPanel = finalPanel;
    }

    /**
     *
     *
     * @return fileName
     */
    public JLabel getFileName() {
        return fileName;
    }

    /**
     *
     * @param fileName
     */
    public void setFileName(JLabel fileName) {
        this.fileName = fileName;
    }

    /**
     *
     * @return fileSize
     */
    public JLabel getFileSize() {
        return fileSize;
    }

    /**
     *
     * @param fileSize
     */
    public void setFileSize(JLabel fileSize) {
        this.fileSize = fileSize;
    }

    /**
     *
     * @return  status
     */
    public JLabel getStatus() {
        return status;
    }

    /**
     *
     *
     * @param status
     */
    public void setStatus(JLabel status) {
        this.status = status;
    }

    /**
     *
     *
     * @return
     */
    public JLabel getSavePath() {
        return savePath;
    }

    /**
     *
     *
     * @param savePath
     */
    public void setSavePath(JLabel savePath) {
        this.savePath = savePath;
    }

    /**
     *
     *
     * @return
     */
    public JLabel getDateAndTime() {
        return dateAndTime;
    }

    /**
     *
     *
     * @param dateAndTime
     */
    public void setDateAndTime(JLabel dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    /**
     *
     *
     * @return
     */
    public JLabel getURL() {
        return URL;
    }

    /**
     *
     *
     * @param URL
     */
    public void setURL(JLabel URL) {
        this.URL = URL;
    }

    /**
     *
     *
     * @return
     */
    public JButton getOpen() {
        return open;
    }

    /**
     *
     *
     * @param open
     */
    public void setOpen(JButton open) {
        this.open = open;
    }

    /**
     *
     *
     * @return
     */
    public JButton getResume() {
        return resume;
    }

    /**
     *
     *
     * @param resume
     */
    public void setResume(JButton resume) {
        this.resume = resume;
    }

    /**
     *
     *
     * @return
     */
    public JButton getCancel() {
        return cancel;
    }

    /**
     *
     *
     * @param cancel
     */
    public void setCancel(JButton cancel) {
        this.cancel = cancel;
    }

    /**
     *
     *
     * @return
     */
    public JProgressBar getProgressBar() {
        return progressBar;
    }

    /**
     *
     *
     * @param progressBar
     */
    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    /**
     *
     *
     * @return
     */
    public JPanel getPanelDownload() {
        return panelDownload;
    }

    /**
     *
     *
     * @param panelDownload
     */
    public void setPanelDownload(JPanel panelDownload) {
        this.panelDownload = panelDownload;
    }

    /**
     *
     *
     * @return
     */
    public JPanel getPanelInformation() {
        return panelInformation;
    }

    /**
     *
     *
     * @param panelInformation
     */
    public void setPanelInformation(JPanel panelInformation) {
        this.panelInformation = panelInformation;
    }

    /**
     *
     *
     * @param myFile
     */
    public void setMyFile(MyFile myFile) {
        this.myFile = myFile;
    }

    /**
     *
     *
     * @return
     */
    public MyURLConnection getMyURLConnection() {
        return myURLConnection;
    }

    /**
     *
     *
     * @param myURLConnection
     */
    public void setMyURLConnection(MyURLConnection myURLConnection) {
        this.myURLConnection = myURLConnection;
    }

    /**
     *
     *
     * @return
     */
    public JTabbedPane getjTabbedPane() {
        return jTabbedPane;
    }

    /**
     *
     *
      * @param jTabbedPane
     */
    public void setjTabbedPane(JTabbedPane jTabbedPane) {
        this.jTabbedPane = jTabbedPane;
    }
    private class MouseHandler implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent().equals(jTabbedPane)&&myFile.isFinished()){
                JOptionPane.showMessageDialog(new JFrame(), myFile.getNameFile());

            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    /**
     * this is private class for listener
     */

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
                    if (myFile.getTypeOfDownload().equals("start now")){
                    myURLConnection=new MyURLConnection(myFile);
                    myURLConnection.start();
                    }

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                checkDownloadIsFinish();
            }

            checkDownloadIsFinish();

        }
    }

}




















































