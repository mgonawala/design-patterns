package Structural.Decorator;

/**
 *
 * Add behaviour to an object without affecting functionality of other parts.
 * Single responsibility principle.
 *
 * Compose behaviour dynamically.
 *
 * Example: InputStream
 *
 * Component, ConcreteComponent, Decorator, ConcreteDecorator.
 */
public class DecoratorPattern {

    public static void main(String[] args) {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
