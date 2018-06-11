package aut.company;

import aut.company.File.ReadFromFile;
import aut.company.File.WriteToFile;
import aut.company.intenet.MyURLConnection;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//layout not set!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

public class EventHandlerForAllOption extends JPanel {

    private BtnHandler btnHandler = new BtnHandler();
    private MenuHandler menuHandler = new MenuHandler();
    private SettingOfDownload settingOfDownload;
    private SettingPack settingPackWithChanging = new SettingPack();
    private int typeOfDownloadPanelForShow = 0;
    private JPanel btnPanel = new JPanel();
    private JPanel downloadPanel = new JPanel();
    private BtnHandlerForShow btnHandlerForShow = new BtnHandlerForShow();
    private GridBagLayout gridBagLayout;
    private GridBagConstraints constraints;

    private JScrollBar scrollBar;
    WriteToFile writeToFile = new WriteToFile();
    ReadFromFile readFromFile = new ReadFromFile();

    private ArrayList<MyFile> myFilesAddToQueues = new ArrayList<>();
    private ArrayList<MyFile> myFilesStartNow = new ArrayList<>();
    private ArrayList<MyFile> myFilesList = new ArrayList<>();
    private ArrayList<MyFile> myFilesRemoved = new ArrayList<>();
    private ArrayList<MyURLConnection> myURLConnectionsStartNow=new ArrayList<>();
    private ArrayList<MyURLConnection> myURLConnectionsAddToQueue=new ArrayList<>();

    MyURLConnection myURLConnectionTmp;

    /**
     * this is constructor
     * handel all custom listener
     * @throws IOException
     * @throws ClassNotFoundException
     */

    public EventHandlerForAllOption() throws IOException, ClassNotFoundException {
        scrollBar = new JScrollBar();
        scrollBar.add(this);
        btnHandler.setCancelDownloadListener(new ICancelDownload() {
            @Override
            public void cancelDownloadClicked() {
                for (MyFile startNow : myFilesStartNow) {
                    startNow.setStatus("status :cancel");
                    startNow.getDownloadPanel().setStatus("status :cancel");
                }
                for (MyFile addToQueue : myFilesAddToQueues) {
                    addToQueue.setStatus("status : canceled");
                    addToQueue.getDownloadPanel().setStatus("status : canceled");
                }

            }
        });
        btnHandler.setNewDownloadListener(new INewDownload() {
            @Override
            public void newDownloadClick() throws IOException, ClassNotFoundException {
                newDownloadFileAdd();
                repaint();
            }
        });
        btnHandler.setResumeDownloadListener(new IResumeDownload() {
            @Override
            public void resumeDownloadClicked() throws IOException, ClassNotFoundException {
                for (MyFile startNow : myFilesStartNow) {
                    startNow.setStatus("status : downloading");
                    startNow.getDownloadPanel().setStatus("status : downloading");

                }
                for (MyFile addToQueue : myFilesAddToQueues) {
                    addToQueue.setStatus("status : downloading");
                    addToQueue.getDownloadPanel().setStatus("status : downloading");
                }

            }
        });
        btnHandler.setStopDownloadListener(new IStopDownload() {
            @Override
            public void stopDownloadClicked() {
                for (MyFile startNow : myFilesStartNow) {
                    startNow.setStatus("status : waiting");
                    startNow.getDownloadPanel().setStatus("status : waiting");
                }
                for (MyFile addToQueue : myFilesAddToQueues) {
                    addToQueue.setStatus("status : downloading");
                    addToQueue.getDownloadPanel().setStatus("status : waiting");
                }
            }
        });
        btnHandler.setRemoveDownloadListener(new IShowButtonForRemoveDownload() {
            @Override
            public void removeDownloadClicked() throws IOException {
                if (myFilesAddToQueues.size() != 0) {
                    myFilesRemoved.add(myFilesAddToQueues.get(myFilesAddToQueues.size() - 1));
                    writeToFile.writingRemovedDownload(myFilesRemoved);
                    myFilesAddToQueues.remove(myFilesAddToQueues.size() - 1);
                    removeAll();
                    repaint();
                }
            }
        });
        btnHandler.setSettingDownloadListener(new ISettingDownload() {
            @Override
            public void settingClicked() {
                settingOfDownload = new SettingOfDownload();
                settingOfDownload.setChangeSettingListener(new IChangeSetting() {
                    @Override
                    public void okClicked(SettingPack settingPack) throws IOException {
                        settingPackWithChanging = settingPack;
                        writeToFile.writingSetting(settingPackWithChanging);
                        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                            if (info.getName().equals(settingPack.getLookAndFeel())) {
                                try {
                                    UIManager.setLookAndFeel(info.getClassName());
                                    removeAll();
                                    repaint();
                                } catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                } catch (InstantiationException e) {
                                    System.out.println("error");
                                    e.printStackTrace();
                                } catch (IllegalAccessException e) {
                                    System.out.println("error.");
                                    e.printStackTrace();
                                } catch (UnsupportedLookAndFeelException e) {
                                    System.out.println("error .");
                                    e.printStackTrace();
                                }
                                break;
                            }
                        }
                    }
                });
            }
        });
        menuHandler.setStopDownloadListener(new IStopDownload() {
            @Override
            public void stopDownloadClicked() {
                for (MyFile startNow : myFilesStartNow) {
                    startNow.setStatus("status : waiting");
                    startNow.getDownloadPanel().setStatus("status : waiting");
                }
                for (MyFile addToQueue : myFilesAddToQueues) {
                    addToQueue.setStatus("status : downloading");
                    addToQueue.getDownloadPanel().setStatus("status : waiting");
                }
            }
        });
        menuHandler.setCancelDownloadListener(new ICancelDownload() {
            @Override
            public void cancelDownloadClicked() {
                for (MyFile startNow : myFilesStartNow) {
                    startNow.setStatus("status :cancel");
                    startNow.getDownloadPanel().setStatus("status :cancel");
                }
                for (MyFile addToQueue : myFilesAddToQueues) {
                    addToQueue.setStatus("status : canceled");
                    addToQueue.getDownloadPanel().setStatus("status : canceled");
                }

            }
        });
        menuHandler.setNewDownloadListener(new INewDownload() {
            @Override
            public void newDownloadClick() {
                newDownloadFileAdd();
                repaint();
            }
        });
        menuHandler.setResumeDownloadListener(new IResumeDownload() {
            @Override
            public void resumeDownloadClicked() throws IOException, InterruptedException {
                for (MyFile startNow : myFilesStartNow) {
                    startNow.setStatus("status : downloading");
                    startNow.getDownloadPanel().setStatus("status : downloading");
                    myURLConnectionTmp=new MyURLConnection(startNow);
                    myURLConnectionsStartNow.add(myURLConnectionTmp);
                }
                for (MyFile addToQueue : myFilesAddToQueues) {
                    addToQueue.setStatus("status : downloading");
                    addToQueue.getDownloadPanel().setStatus("status : downloading");
                    myURLConnectionTmp=new MyURLConnection(addToQueue);
                    myURLConnectionsAddToQueue.add(myURLConnectionTmp);
                }
                ExecutorService pool = Executors.newFixedThreadPool(myURLConnectionsStartNow.size());
                for (int i = 0; i <myURLConnectionsStartNow.size() ; i++) {
                    if (i>settingPackWithChanging.getLimitedDownloading()){
                        myURLConnectionsStartNow.get(i).sleep(500);
                        i--;
                    }else {
                        pool.execute(myURLConnectionsStartNow.get(i));
                        pool.shutdown();

                    }
                }
                for (int i = 0; i <myURLConnectionsAddToQueue.size() ; i++) {
                    ExecutorService poolAdd = Executors.newFixedThreadPool(1);
                    poolAdd.execute(myURLConnectionsAddToQueue.get(i));
                    poolAdd.shutdown();
                }

            }
        });
        menuHandler.setStopDownloadListener(new IStopDownload() {
            @Override
            public void stopDownloadClicked() {
                for (MyFile startNow : myFilesStartNow) {
                    startNow.setStatus("status : waiting");
                    startNow.getDownloadPanel().setStatus("status : waiting");
                }
                for (MyFile addToQueue : myFilesAddToQueues) {
                    addToQueue.setStatus("status : downloading");
                    addToQueue.getDownloadPanel().setStatus("status : waiting");
                }
            }
        });
        menuHandler.setRemoveDownloadListener(new IShowButtonForRemoveDownload() {
            @Override
            public void removeDownloadClicked() {
                if (myFilesAddToQueues.size() != 0) {
                    myFilesRemoved.add(myFilesAddToQueues.get(myFilesAddToQueues.size() - 1));
                    myFilesAddToQueues.remove(myFilesAddToQueues.size() - 1);
                    removeAll();
                    repaint();
                }
            }
        });
        menuHandler.setSettingDownloadListener(new ISettingDownload() {
            @Override
            public void settingClicked() {
                settingOfDownload = new SettingOfDownload();
                settingOfDownload.setChangeSettingListener(new IChangeSetting() {
                    @Override
                    public void okClicked(SettingPack settingPack) {
                        settingPackWithChanging = settingPack;
                        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                            if (info.getName().equals(settingPack.getLookAndFeel())) {
                                try {
                                    UIManager.setLookAndFeel(info.getClassName());
                                } catch (ClassNotFoundException e) {
                                    e.printStackTrace();
                                } catch (InstantiationException e) {
                                    System.out.println("error");
                                    e.printStackTrace();
                                } catch (IllegalAccessException e) {
                                    System.out.println("error.");
                                    e.printStackTrace();
                                } catch (UnsupportedLookAndFeelException e) {
                                    System.out.println("error .");
                                    e.printStackTrace();
                                }
                                break;
                            }
                        }
                    }
                });
            }
        });
        menuHandler.setAboutListener(new IAboutDownload() {
            @Override
            public void aboutClicked() {
                About about = new About(myFilesStartNow.get(0));
            }
        });
        menuHandler.setExitListener(new IExit() {
            @Override
            public void exitClicked() {

            }
        });
        btnHandlerForShow.setIShowButtonForAllDownload(new IShowButtonForAllDownload() {
            @Override
            public void showAllDownloadClicked() {
                typeOfDownloadPanelForShow = 0;
                removeAll();
                repaint();
            }
        });
        btnHandlerForShow.setIShowButtonForCompletedDownload(new IShowButtonForCompletedDownload() {
            @Override
            public void ShowCompletedDownloadClicked() {
                typeOfDownloadPanelForShow = 1;
                removeAll();
                repaint();
            }
        });
        btnHandlerForShow.setIShowButtonForQueue(new IShowButtonForQueue() {
            @Override
            public void showQueueDownloadClicked() {
                typeOfDownloadPanelForShow = 2;
                removeAll();
                repaint();
            }
        });
        btnHandlerForShow.setIShowButtonForRemoveDownload(new IShowButtonForRemoveDownload() {
            @Override
            public void removeDownloadClicked() throws IOException, ClassNotFoundException {
                myFilesList.addAll(readFromFile.readingAllDownload());
                myFilesStartNow.addAll(readFromFile.readingStartNowDownload());
                myFilesAddToQueues.addAll(readFromFile.readingQueueDownload());
                settingPackWithChanging = readFromFile.readingSettingPack();
                myFilesRemoved = readFromFile.readingRemovedDownload();
                removeAll();
                repaint();
                RemovedFrame removedFrame = new RemovedFrame(myFilesRemoved);
            }
        });
        btnHandlerForShow.setICostumeSort(new ICostumeSort() {
            @Override
            public void iCostumeSortClick() {
                typeOfDownloadPanelForShow = 3;
                removeAll();
                repaint();
            }
        });
        btnHandlerForShow.setISearching(new ISearching() {
            @Override
            public void searchClicked() {
                typeOfDownloadPanelForShow = 4;
                removeAll();
                repaint();
            }
        });

    }

    /**
     * download set array method
     */
    public void newDownloadFileAdd() {
        NewDownloadFrame newDownloadFrame = new NewDownloadFrame(settingPackWithChanging);
        newDownloadFrame.setEventListener(new IDownloadingBtn() {
            @Override
            public void downloadClicked(MyFile file) throws IOException, ClassNotFoundException {
                DownloadPanel downloadPanel = new DownloadPanel(file);
                downloadPanel.getMyFile().setDownloadPanel(downloadPanel);
                myFilesList.add(downloadPanel.getMyFile());
                if (downloadPanel.getMyFile().getTypeOfDownload().equals("start now")) {
                    if (settingPackWithChanging.getLimitedDownloading() == 0 || settingPackWithChanging.getLimitedDownloading() > myFilesStartNow.size()) {
                        downloadPanel.getMyFile().setStatus("downloading");
                        myFilesStartNow.add(downloadPanel.getMyFile());

                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "your downloading is limited is over");
                        downloadPanel.getMyFile().setStatus("waiting");
                        myFilesStartNow.add(downloadPanel.getMyFile());
                    }

                    writeToFile.writingStartNowDownload(myFilesStartNow);
                } else {
                    myFilesAddToQueues.add(downloadPanel.getMyFile());
                    writeToFile.writingQueueDownload(myFilesAddToQueues);
                }

                writeToFile.writingDownloadList(myFilesList);


            }

        });

    }

    /**
     * paint component override method
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        if (typeOfDownloadPanelForShow == 0) {
            for (int i = 0; i < myFilesStartNow.size(); i++) {
                constraints.gridx = 0;
                constraints.gridy = i;
                add(myFilesStartNow.get(i).getDownloadPanel(), constraints);
            }
            for (int i = 0; i < myFilesAddToQueues.size(); i++) {
                constraints.gridx = 1;
                constraints.gridy = i;
                add(myFilesAddToQueues.get(i).getDownloadPanel(), constraints);

            }
        } else if (typeOfDownloadPanelForShow == 1) {
            for (int i = 0; i < myFilesStartNow.size(); i++) {
                if (myFilesStartNow.get(i).isFinished()) {
                    constraints.gridx = 0;
                    constraints.gridy = i;
                    add(myFilesStartNow.get(i).getDownloadPanel(), constraints);
                }
            }
            for (int i = 0; i < myFilesAddToQueues.size(); i++) {
                if (myFilesAddToQueues.get(i).isFinished()) {
                    constraints.gridx = 1;
                    constraints.gridy = i;
                    add(myFilesAddToQueues.get(i).getDownloadPanel(), constraints);
                }
            }
        } else if (typeOfDownloadPanelForShow == 2) {

            for (int i = 0; i < myFilesAddToQueues.size(); i++) {
                constraints.gridx = 1;
                constraints.gridy = i;
                add(myFilesAddToQueues.get(i).getDownloadPanel(), constraints);

            }
        } else if (typeOfDownloadPanelForShow == 3) {
            if (settingPackWithChanging.getSortBy().equals("name")) {
                for (int i = 0; i < sortNameMyFileStartNow().size(); i++) {
                    constraints.gridx = 0;
                    constraints.gridy = i;
                    add(sortNameMyFileStartNow().get(i).getDownloadPanel(), constraints);
                }
            }
            if (settingPackWithChanging.getSortBy().equals("time")) {
                for (int i = 0; i < sortDateAndTimeMyFileStartNow().size(); i++) {
                    constraints.gridx = 0;
                    constraints.gridy = i;
                    add(sortDateAndTimeMyFileStartNow().get(i).getDownloadPanel(), constraints);
                }
            }
            if (settingPackWithChanging.getSortBy().equals("size")) {
                for (int i = 0; i < sortSizeMyFileStartNow().size(); i++) {
                    constraints.gridx = 0;
                    constraints.gridy = i;
                    add(sortSizeMyFileStartNow().get(i).getDownloadPanel(), constraints);
                }
            }


        } else if (typeOfDownloadPanelForShow == 4) {
            for (int i = 0; i < searching().size(); i++) {
                constraints.gridx = 0;
                constraints.gridy = i;
                add(searching().get(i).getDownloadPanel(), constraints);

            }
        }
    }

    /**
     * set sort array list
     * @return
     */
    public ArrayList<MyFile> sortNameMyFileStartNow() {
        ArrayList<MyFile> nameSort = new ArrayList<>();
        nameSort.addAll(myFilesList);
        nameSort.addAll(nameSort);
        Collections.sort(nameSort, new Comparator<MyFile>() {
            @Override
            public int compare(MyFile o1, MyFile o2) {
                if (0 < o1.getNameFile().compareTo(o2.getNameFile())) {
                    return -1;
                } else if (0 < o1.getNameFile().compareTo(o2.getNameFile())) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return nameSort;
    }

    /**
     * set sort array list
     * @return
     */
    public ArrayList<MyFile> sortDateAndTimeMyFileStartNow() {
        ArrayList<MyFile> dateSort = new ArrayList<>();
        dateSort.addAll(myFilesList);
        dateSort.addAll(dateSort);
        Collections.sort(dateSort, new Comparator<MyFile>() {
            @Override
            public int compare(MyFile o1, MyFile o2) {
                if (0 > o1.getTime().compareTo(o2.getTime())) {
                    return -1;
                } else if (0 < o1.getNameFile().compareTo(o2.getNameFile())) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return dateSort;
    }

    /**
     * set sort array list
     * @return int type for show
     */
    public ArrayList<MyFile> sortSizeMyFileStartNow() {
        ArrayList<MyFile> sizeSort = new ArrayList<>();
        sizeSort.addAll(myFilesList);
        sizeSort.addAll(sizeSort);
        Collections.sort(sizeSort, new Comparator<MyFile>() {
            @Override
            public int compare(MyFile o1, MyFile o2) {
                if (Integer.parseInt(o1.getSize()) < Integer.parseInt(o2.getSize())) {
                    return -1;
                } else if (Integer.parseInt(o1.getSize()) < Integer.parseInt(o2.getSize())) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return sizeSort;
    }

    /**
     * set sort array list
     * @return
     */
    public ArrayList<MyFile> searching() {
        ArrayList<MyFile> searchArrayList = new ArrayList<>();
        for (MyFile myFile : myFilesList) {
            if (myFile.getNameFile().contains(settingPackWithChanging.getSearch())) {
                searchArrayList.add(myFile);
            }
        }
        return searchArrayList;
    }


    public BtnHandler getBtnHandler() {
        return btnHandler;
    }

    public void setBtnHandler(BtnHandler btnHandler) {
        this.btnHandler = btnHandler;
    }

    public MenuHandler getMenuHandler() {
        return menuHandler;
    }

    public void setMenuHandler(MenuHandler menuHandler) {
        this.menuHandler = menuHandler;
    }


    public BtnHandlerForShow getBtnHandlerForShow() {
        return btnHandlerForShow;
    }

    public JScrollBar getScrollBar() {
        return scrollBar;
    }

    public SettingPack getSettingPackWithChanging() {
        return settingPackWithChanging;
    }

}

