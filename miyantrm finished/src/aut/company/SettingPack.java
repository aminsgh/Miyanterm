package aut.company;

import java.io.Serializable;

public class SettingPack implements Serializable {
    private String savePath;
    private String lookAndFeel;
    private boolean typeOfDownload;
    private int limitedDownloading;
    private String sortBy;
    private String search;

    public SettingPack(String savePath, String lookAndFeel, boolean typeOfDownload, int limitedDownloading, String sortBy) {
        this.savePath = savePath;
        this.lookAndFeel = lookAndFeel;
        this.typeOfDownload = typeOfDownload;
        this.limitedDownloading = limitedDownloading;
        this.sortBy = sortBy;
        this.search = "";
    }

    public SettingPack(String savePath, String lookAndFeel, boolean typeOfDownload, int limitedDownloading, String sortBy, String search) {
        this.savePath = savePath;
        this.lookAndFeel = lookAndFeel;
        this.typeOfDownload = typeOfDownload;
        this.limitedDownloading = limitedDownloading;
        this.sortBy = sortBy;
        this.search = search;
    }

    public SettingPack() {
        this("C:\\Users\\amin_\\Desktop", "Windows", true, 0, "name", "");
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

    public String getTypeOfDownloadString() {
        if (typeOfDownload) {
            return "start now";
        } else return "add to queues";
    }

    public String getLookAndFeel() {
        return lookAndFeel;
    }

    public void setLookAndFeel(String lookAndFeel) {
        this.lookAndFeel = lookAndFeel;
    }

    public int getLimitedDownloading() {
        return limitedDownloading;
    }

    public void setLimitedDownloading(int limitedDownloading) {
        this.limitedDownloading = limitedDownloading;
    }

    public boolean isTypeOfDownload() {
        return typeOfDownload;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
