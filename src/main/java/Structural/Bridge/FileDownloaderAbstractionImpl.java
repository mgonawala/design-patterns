package Structural.Bridge;

public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction{

    //Composition
    FileDownloaderImplementor fileDownloaderImplementor;

    public FileDownloaderAbstractionImpl(FileDownloaderImplementor fileDownloaderImplementor) {
        this.fileDownloaderImplementor = fileDownloaderImplementor;
    }


    @Override
    public Object download(String path) {
        return fileDownloaderImplementor.download(path);
    }

    @Override
    public boolean store(Object object) {
        return fileDownloaderImplementor.store(object);
    }
}
