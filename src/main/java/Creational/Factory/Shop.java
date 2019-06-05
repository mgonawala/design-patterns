package Creational.Factory;

public class Shop extends Website {

    @Override
    public Website createWebsite() {
        pages.add(new Cart());
        return this;
    }
}
