package Behavioral.Visitor;

/**
 *
 * Part corresponds to Element concept of this patter.
 * Every element must have an accept method accepting Visitor as an argument.
 *
 */
public interface CarPart {

    public void accept(PartVisitor partVisitor);

    public double calculateShipping();
}
