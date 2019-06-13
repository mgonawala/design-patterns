package Structural.Bridge;

public class WindowsDownloaderImplementor implements FileDownloaderImplementor {


    @Override
    public Object download(String path) {
        System.out.println("Downloading from windows system.");
        return new Object();
    }

    @Override
    public boolean store(Object object) {
        System.out.println("Storing in windows system.");
        return true;
    }
}
