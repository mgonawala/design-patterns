package Structural.Composite;

import java.util.ArrayList;
import java.util.List;


// Our abstract component class
public abstract class MenuComponent {

    String name;

    String url;

    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent){
        StringBuilder stringBuilder = new StringBuilder("Name:");
        stringBuilder.append(this.name).append(", Url:").append(url).append("\n");
        return stringBuilder.toString();
    }
}
