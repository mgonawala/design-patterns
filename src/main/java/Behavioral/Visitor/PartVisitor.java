package Behavioral.Visitor;


/**
 *
 * Visitor must know abot all elements & how to apply algorithm on each element.
 */
public interface PartVisitor {

    public void visit(Wheel carPart);

    public void visit(Oil oil);

    public void visit(Fender fender);


    public void visit(PartOrder partOrder);
}
