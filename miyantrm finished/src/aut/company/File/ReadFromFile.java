package aut.company.File;

import aut.company.DownloadPanel;
import aut.company.MyFile;
import aut.company.SettingPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadFromFile {
    private ArrayList<MyFile> allDownloadArrayList = new ArrayList<>();
    private ArrayList<MyFile> removedArrayList = new ArrayList<>();
    private ArrayList<MyFile> queueArrayList = new ArrayList<>();
    private ArrayList<MyFile> startNowArrayList = new ArrayList<>();
    private SettingPack settingPack;

    public ReadFromFile() {

    }

    /**
     * reading method
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ArrayList<MyFile> readingAllDownload() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("list.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        allDownloadArrayList.addAll((ArrayList<MyFile>) ois.readObject());
        ois.close();
        fis.close();
        for (int i = 0; i <allDownloadArrayList.size(); i++) {
            DownloadPanel downloadPanel = new DownloadPanel(allDownloadArrayList.get(i));
            allDownloadArrayList.get(i).setDownloadPanel(downloadPanel);
        }
        return allDownloadArrayList;
    }

    /**
     * reading method
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ArrayList<MyFile> readingRemovedDownload() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("remove.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        removedArrayList.addAll((ArrayList<MyFile>) ois.readObject());
        ois.close();
        fis.close();
        for (int i = 0; i <removedArrayList.size(); i++) {
            DownloadPanel downloadPanel = new DownloadPanel(removedArrayList.get(i));
            removedArrayList.get(i).setDownloadPanel(downloadPanel);
        }
        return removedArrayList;
    }

    /**
     * reading method
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ArrayList<MyFile> readingQueueDownload() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("queue.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        queueArrayList.addAll((ArrayList<MyFile>) ois.readObject());
        ois.close();
        fis.close();
        for (int i = 0; i <queueArrayList.size(); i++) {
            DownloadPanel downloadPanel = new DownloadPanel(queueArrayList.get(i));
            queueArrayList.get(i).setDownloadPanel(downloadPanel);
        }

        return queueArrayList;
    }

    /**
     * reading method
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public SettingPack readingSettingPack() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("setting.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        settingPack = (SettingPack) ois.readObject();
        ois.close();
        fis.close();
        return settingPack;
    }

    /**
     * reading method
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ArrayList<MyFile> readingStartNowDownload() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("start now.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        startNowArrayList = (ArrayList<MyFile>) ois.readObject();
        ois.close();
        fis.close();
        for (int i = 0; i <startNowArrayList.size(); i++) {
            DownloadPanel downloadPanel = new DownloadPanel(startNowArrayList.get(i));
            startNowArrayList.get(i).setDownloadPanel(downloadPanel);
        }
        return startNowArrayList;
    }


}
