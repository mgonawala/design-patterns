package Creational.Factory;

import java.util.List;

public abstract class Website {

    protected List<Page> pages;

    public List<Page> getPages() {
        return pages;
    }

    public abstract Website createWebsite();
}
