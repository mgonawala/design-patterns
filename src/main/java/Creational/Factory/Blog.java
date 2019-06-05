package Creational.Factory;

public class Blog extends Website {

    @Override
    public Website createWebsite() {
        pages.add(new DetailsPage());
        return this;
    }
}
