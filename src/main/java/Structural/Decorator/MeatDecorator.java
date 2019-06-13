package Structural.Decorator;

public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return  customSandwich.make() + addMeat();
    }

    public String addMeat(){
        return " + Tukey";
    }
}
