package assign02_05_2024multithreading;

import java.awt.*;
import java.io.*;
import java.net.URL;

public class FileDownloader extends Thread {
    private String url;
    private String savePath;
    private volatile boolean stopRequested = false;

    public FileDownloader(String url, String savePath) {
        this.url = url;
        this.savePath = savePath;
    }

    public void interruptDownload() {
        stopRequested = true;
        this.interrupt();
    }

    @Override
    public void run() {
        try {
            URL fileUrl = new URL(url);
            try (BufferedInputStream in = new BufferedInputStream(fileUrl.openStream());
                 FileOutputStream fileOutputStream = new FileOutputStream(savePath)) {

                byte[] dataBuffer = new byte[1024];
                int bytesRead;
                long fileSize = getFileSize(fileUrl);
                long totalBytesRead = 0;

                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1 && !stopRequested) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                    totalBytesRead += bytesRead;
                    int percentage = (int) ((totalBytesRead * 100) / fileSize);
                    System.out.println("Downloaded: " + percentage + "%");
                }
                // File downloaded successfully, open it with the default application
                if (!stopRequested) {
                    openWithDefaultApplication(savePath);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private long getFileSize(URL url) throws IOException {
        return url.openConnection().getContentLengthLong();
    }

    private void openWithDefaultApplication(String filePath) {
        try {
            File file = new File(filePath);
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileUrl = "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3";
        String savePath = "downloaded-file.mp3";

        FileDownloader downloader = new FileDownloader(fileUrl, savePath);
        downloader.start();

        // Simulate interruption after 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        downloader.interruptDownload();
    }
}
