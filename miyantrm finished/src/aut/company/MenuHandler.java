package aut.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuHandler  {
    private MenuBar menuBar ;
    private ICancelDownload cancelDownloadListener;
    private INewDownload newDownloadListener;
    private IStopDownload stopDownloadListener;
    private IResumeDownload resumeDownloadListener;
    private IShowButtonForRemoveDownload removeDownloadListener;
    private ISettingDownload settingDownloadListener;
    private IAboutDownload aboutListener;
    private IExit exitListener;


    public MenuHandler() {
        menuBar=new MenuBar();
        MenuListener menuHandler=new MenuListener();
        menuBar.getAddNewDownload().addActionListener(menuHandler);
        menuBar.getRemove().addActionListener(menuHandler);
        menuBar.getPause().addActionListener(menuHandler);
        menuBar.getResume().addActionListener(menuHandler);
        menuBar.getCancel().addActionListener(menuHandler);
        menuBar.getSetting().addActionListener(menuHandler);
        menuBar.getExit().addActionListener(menuHandler);
        menuBar.getAbout().addActionListener(menuHandler);

    }

    public JMenuBar getJMenuBar() {
        return menuBar.getJMenuBar();
    }
    private class MenuListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(menuBar.getAddNewDownload())) {
                System.out.println("new download");
                try {
                    newDownloadListener.newDownloadClick();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource().equals(menuBar.getRemove())){
                System.out.println("remove");
                try {
                    removeDownloadListener.removeDownloadClicked();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource().equals(menuBar.getPause())){
                System.out.println("pause");
                stopDownloadListener.stopDownloadClicked();
            }else if (e.getSource().equals(menuBar.getResume())){
                System.out.println("resume");
                try {
                    try {
                        resumeDownloadListener.resumeDownloadClicked();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                }
            }else if (e.getSource().equals(menuBar.getCancel())){
                System.out.println("cancel");
                cancelDownloadListener.cancelDownloadClicked();
            }else if (e.getSource().equals(menuBar.getExit())){
                System.out.println("exit");
                exitListener.exitClicked();
            }else if (e.getSource().equals(menuBar.getSetting())){
                System.out.println("setting");
                settingDownloadListener.settingClicked();
            }else if (e.getSource().equals(menuBar.getAbout())){
                System.out.println("about");
               aboutListener.aboutClicked();
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

    public void setAboutListener(IAboutDownload aboutListener) {
        this.aboutListener = aboutListener;
    }

    public void setExitListener(IExit exitListener) {
        this.exitListener = exitListener;
    }
}
