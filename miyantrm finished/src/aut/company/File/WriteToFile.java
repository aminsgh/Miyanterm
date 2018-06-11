package aut.company.File;

import aut.company.SettingPack;
import aut.company.MyFile;
import aut.company.SettingPack;

import java.io.*;
import java.util.ArrayList;

public class WriteToFile {
    public WriteToFile()  {
    }

    /**
     * writing method
     * @param myFileList
     * @throws IOException
     */
    public void writingDownloadList(ArrayList<MyFile> myFileList)throws IOException{
        FileOutputStream fos = new FileOutputStream("list.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(myFileList);
        oos.close();
        fos.close();
    }

    /**
     * writing method
     * @param settingPack
     * @throws IOException
     */
    public void writingSetting(SettingPack settingPack) throws IOException {
        FileOutputStream fos = new FileOutputStream("setting.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(settingPack);
        oos.close();
        fos.close();
    }

    /**
     * writing method
     * @param removedArrayList
     * @throws IOException
     */
    public void writingRemovedDownload(ArrayList<MyFile> removedArrayList) throws IOException {
        FileOutputStream fos = new FileOutputStream("remove.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(removedArrayList);
        oos.close();
        fos.close();
    }

    /**
     * writing method
     * @param queueArrayList
     * @throws IOException
     */
    public void writingQueueDownload(ArrayList<MyFile> queueArrayList) throws IOException {
        FileOutputStream fos = new FileOutputStream("queue.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(queueArrayList);
        oos.close();
        fos.close();
    }

    /**
     * writing method
     * @param starNowArrayList
     * @throws IOException
     */
    public void writingStartNowDownload(ArrayList<MyFile> starNowArrayList) throws IOException {
        FileOutputStream fos = new FileOutputStream("start now.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(starNowArrayList);
        oos.close();
        fos.close();
    }

}
