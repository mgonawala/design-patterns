package Behavioral.Visitor;

/**
 *
 * Visitor pattern is a great way to seperate out an algorithm from object structure.
 * When you want to add new features without changing
 * any object hierarchy, you should be using Visitor pattern.
 *
 * In this pattern, visitor know sof every element
 * and Elements have a visit method.
 *
 * Visitor, ConcreteVisitor,
 * Element, COncreteElement.
 *
 */
public class VisitorPattern {

    public static void main(String[] args) {
        PartOrder partOrder = new PartOrder();
        partOrder.addPart(new Wheel());
        partOrder.addPart(new Oil());
        partOrder.addPart(new Fender());

        //System.out.println(partOrder.calculateShipping());

        partOrder.accept(new ConcretePartVisitor());
        partOrder.accept(new SumOfWeightVisitor());
    }
}
