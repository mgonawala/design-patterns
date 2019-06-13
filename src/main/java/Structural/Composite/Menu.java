package Structural.Composite;

//Composite Class
// This will have operations to access child

public class Menu extends MenuComponent{

    public Menu(String name , String url) {
        this.name = name;
        this.url = url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        this.menuComponents.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent){
        this.menuComponents.remove(menuComponent);
        return  menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.print(this));

        menuComponents.forEach( component ->{
            builder.append(component.toString());
        });

        return  builder.toString();
    }
}
