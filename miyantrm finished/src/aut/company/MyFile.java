package aut.company;

import javax.swing.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyFile implements Serializable{
    private static final long serialVersionUID = 1L;
    private String URL;
    private String nameFile;
    private String savePath;
    private String typeOfDownload;
    private String size;
    private String status;
    private String time;
    private boolean finished;
    private transient DownloadPanel downloadPanel;
    private String lookAndFeel;

    public MyFile(String URL, String nameFile, String savePath, String size, String typeOfDownload) {
        this.URL = URL;
        this.nameFile = nameFile;
        this.savePath = savePath;
        this.size = size;
        this.typeOfDownload = typeOfDownload;
        this.finished = false;
        this.time=getCurrentTime();
    }
public String getCurrentTime(){
    DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now =LocalDateTime.now();
   return dateTimeFormatter.format(now);

}

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getTypeOfDownload() {
        return typeOfDownload;
    }

    public void setTypeOfDownload(String typeOfDownload) {
        this.typeOfDownload = typeOfDownload;
    }

    public DownloadPanel getDownloadPanel() {
        return downloadPanel;
    }

    public void setDownloadPanel(DownloadPanel downloadPanel) {
        this.downloadPanel = downloadPanel;
    }

    public String getLookAndFeel() {
        return lookAndFeel;
    }

    public void setLookAndFeel(String lookAndFeel) {
        this.lookAndFeel = lookAndFeel;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "MyFile{" +
                "URL='" + URL + '\'' +
                ", nameFile='" + nameFile + '\'' +
                ", savePath='" + savePath + '\'' +
                ", typeOfDownload='" + typeOfDownload + '\'' +
                ", size='" + size + '\'' +
                ", status='" + status + '\'' +
                ", finished=" + finished +
                ", lookAndFeel='" + lookAndFeel + '\'' +
                '}';
    }
}
