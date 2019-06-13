package Structural.Decorator;

public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        //System.out.println("Bread");
        return "Bread";
    }
}
