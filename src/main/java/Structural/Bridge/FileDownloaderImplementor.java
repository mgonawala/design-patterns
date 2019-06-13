package Structural.Bridge;

public interface FileDownloaderImplementor {

    Object download(String path);

    boolean store(Object object);
}
