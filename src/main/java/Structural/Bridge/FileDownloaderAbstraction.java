package Structural.Bridge;

public interface FileDownloaderAbstraction {

    Object download(String path);

    boolean store(Object object);
}
