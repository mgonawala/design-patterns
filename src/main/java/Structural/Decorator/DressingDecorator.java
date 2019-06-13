package Structural.Decorator;

public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return  customSandwich.make() + addDressing();
    }

    public String addDressing(){
        return " + Mustard";
    }
}
