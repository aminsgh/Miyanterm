package aut.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class BtnHandler extends JPanel {
    private BtnGroup btnGroup;

    private ICancelDownload cancelDownloadListener;
    private INewDownload newDownloadListener;
    private IStopDownload stopDownloadListener;
    private IResumeDownload resumeDownloadListener;
    private IShowButtonForRemoveDownload removeDownloadListener;
    private ISettingDownload settingDownloadListener;


    public BtnHandler() {
        setLayout(new GridLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        btnGroup = new BtnGroup();
        BtnListener btnListener = new BtnListener();
        btnGroup.getNewDownland().addActionListener(btnListener);
        btnGroup.getCancel().addActionListener(btnListener);
        btnGroup.getPause().addActionListener(btnListener);
        btnGroup.getResume().addActionListener(btnListener);
        btnGroup.getRemove().addActionListener(btnListener);
        btnGroup.getSettings().addActionListener(btnListener);
        constraints.gridy = 0;
        constraints.gridx = 0;
        add(btnGroup.getNewDownland(), constraints);
        constraints.gridx = 1;
        add(btnGroup.getCancel(), constraints);
        constraints.gridx = 2;
        add(btnGroup.getPause(), constraints);
        constraints.gridx = 3;
        add(btnGroup.getResume(), constraints);
        constraints.gridx = 4;
        add(btnGroup.getRemove(), constraints);
        constraints.gridx = 5;
        add(btnGroup.getSettings(), constraints);


    }

    private class BtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btnGroup.getNewDownland())) {
                System.out.println("new download");
                try {
                    newDownloadListener.newDownloadClick();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
            if (e.getSource().equals(btnGroup.getCancel())) {
                System.out.println("cancel");
                cancelDownloadListener.cancelDownloadClicked();
            }
            if (e.getSource().equals(btnGroup.getPause())) {
                System.out.println("pause");
                stopDownloadListener.stopDownloadClicked();
            }
            if (e.getSource().equals(btnGroup.getResume())) {
                System.out.println("resume1");
                try {
                    resumeDownloadListener.resumeDownloadClicked();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
            if (e.getSource().equals(btnGroup.getRemove())) {
                try {
                    removeDownloadListener.removeDownloadClicked();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
                System.out.println("remove");
            }
            if (e.getSource().equals(btnGroup.getSettings())) {
                System.out.println("setting");
                settingDownloadListener.settingClicked();
            }
        }

    }

    public void setCancelDownloadListener(ICancelDownload iCancelDownload) {
        this.cancelDownloadListener = iCancelDownload;
    }

    public void setResumeDownloadListener(IResumeDownload iResumeDownload) {
        this.resumeDownloadListener = iResumeDownload;
    }

    public void setNewDownloadListener(INewDownload iNewDownload) {
        this.newDownloadListener = iNewDownload;
    }

    public void setStopDownloadListener(IStopDownload iStopDownload) {
        this.stopDownloadListener = iStopDownload;
    }

    public void setSettingDownloadListener(ISettingDownload settingDownloadListener) {
        this.settingDownloadListener = settingDownloadListener;
    }

    public void setRemoveDownloadListener(IShowButtonForRemoveDownload removeDownloadListener) {
        this.removeDownloadListener = removeDownloadListener;
    }
}
