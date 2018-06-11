package aut.company.intenet;

import aut.company.MyFile;

import javax.net.ssl.HttpsURLConnection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyURLConnection extends Thread {
    private URL url;
    private HttpURLConnection httpConn;
    private int responseCodeHttp;
    private double downloaded = 0;
    private MyFile myFile;
    private static final int BUFFER_SIZE = 4096;


    public MyURLConnection(MyFile myFile) throws IOException {
        this.myFile = myFile;

    }

    /**
     * url and connection method
     * @param fileURL
     * @param saveDir
     * @param myFile
     * @throws IOException
     * @throws InterruptedException
     */
    public void HttpDownloadUtility(String fileURL, String saveDir, MyFile myFile) throws IOException, InterruptedException {

        URL url = new URL(fileURL);
        httpConn = (HttpURLConnection) url.openConnection();
        responseCodeHttp = httpConn.getResponseCode();

        // always check HTTP response code first
        if (responseCodeHttp == HttpURLConnection.HTTP_OK) {
            String fileName = "";
            String disposition = httpConn.getHeaderField("Content-Disposition");
            String contentType = httpConn.getContentType();
            int contentLength = httpConn.getContentLength();

            if (disposition != null) {
                // extracts file name from header field
                int index = disposition.indexOf("filename=");
                if (index > 0) {
                    fileName = disposition.substring(index + 10,
                            disposition.length() - 1);
                }
            } else {

                fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1,
                        fileURL.length());
            }

            System.out.println("Content-Type = " + contentType);
            System.out.println("Content-Disposition = " + disposition);
            System.out.println("Content-Length = " + contentLength);
            System.out.println("fileName = " + fileName);

            // opens input stream from the HTTP connection
            InputStream inputStream = httpConn.getInputStream();
            String saveFilePath = saveDir + File.separator + fileName;

            // opens an output stream to save into file
            FileOutputStream outputStream = new FileOutputStream(saveFilePath);

            int bytesRead = -1;
            byte[] buffer = new byte[BUFFER_SIZE];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                downloaded += bytesRead;
                outputStream.write(buffer, 0, bytesRead);
                myFile.getDownloadPanel().setProgressBarPercent(downloaded*100 / contentLength);
                System.out.println((int)(downloaded*100/contentLength));
                Thread.sleep(500);

            }
            myFile.getDownloadPanel().setStatus("status :finished");
            myFile.setNameFile(fileName);
            myFile.setSize(contentLength+"");
            myFile.getDownloadPanel().getFileSize().setText(myFile.getDownloadPanel().getFileSize().getText()+contentLength);
            myFile.getDownloadPanel().getFileName().setText(myFile.getDownloadPanel().getFileName().getText()+fileName);
            myFile.setFinished(true);
            outputStream.close();
            inputStream.close();
            System.out.println("File downloaded");

        } else {
            System.out.println("No file to download. Server replied HTTP code: " + responseCodeHttp);
            myFile.getDownloadPanel().setStatus("status :download failed");
            myFile.getDownloadPanel().getFileSize().setText(myFile.getDownloadPanel().getFileSize().getText()+"failed");
            myFile.getDownloadPanel().getFileName().setText(myFile.getDownloadPanel().getFileName().getText()+"failed");

            myFile.setFinished(false);
        }
        httpConn.disconnect();
    }
    @Override
    public void run(){
        try {
            HttpDownloadUtility(myFile.getURL(), myFile.getSavePath(), myFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}