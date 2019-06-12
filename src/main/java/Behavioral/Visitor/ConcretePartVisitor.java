package Behavioral.Visitor;

public class ConcretePartVisitor implements PartVisitor {


    double shippingCost = 0;

    @Override
    public void visit(Wheel carPart) {
        shippingCost += 15;

    }

    @Override
    public void visit(Oil oil) {
        shippingCost += 10;
    }

    @Override
    public void visit(Fender fender) {
        shippingCost += 5;
    }

    @Override
    public void visit(PartOrder partOrder) {
        System.out.println("SHipping amount fo this order is :"+ shippingCost);
    }
}
