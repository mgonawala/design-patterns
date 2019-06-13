package Behavioral.Template;



/**
 *
 * It allows to define an algorithm but
 * allows sub classes to provided pieces of algorithm.
 *
 *
 * Template method pattern is used when you want your
 * implementation classes to follow some algorithm steps
 * in the predefined order. But those steps implementation
 * can be different in different implementation classes.
 *
 * ie.e To build a house, you want specific implementation
 * for walls, decoration & paining.
 * But general implementation for roof & floor.
 *
 * Also, this has to be done in order,
 * First floor, roof, walls, decoration & painting.
 *
 * Now you can have different types of houses built.
 *
 * GlassWallsHouse, ConcreteWallsHouse.
 *
 * So, in the abstraction, provide default implementation
 * for floor & roof, abstract methods for walls ,decoration &
 * painting which concrete calsses will implement
 * & a final template method which binds it all
 * makes a defined order to steps to be executed.
 *
 * Make if final so concrete classes cant change
 * the order of execution.
 *
 *
 * Design:
 * AbstractBaseClass, CocreteClass
 *
 * Collections.sort(list) is an example of using tempalate pattern method.
 * here list is expected to be of comparable elements.
 * which should provide implementation of coparteTo method.
 *
 * which is used in sort algorithm.
 *
 * So sort is template method, which client is calling.
 * & hook method is compareTo , whose implementation is client dependent.
 * SO you can tweak sorting algorithm with different implementation of compareTo method.
 *
 *
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        OrderTemplate orderTemplate = new WebOrder();
        orderTemplate.processOrder();

    }
}
