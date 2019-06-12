package Behavioral.Visitor;

public class SumOfWeightVisitor implements PartVisitor {

    int totalWeight = 0;

    @Override
    public void visit(Wheel carPart) {
        totalWeight +=  5;
    }

    @Override
    public void visit(Oil oil) {
        totalWeight += 10;
    }

    @Override
    public void visit(Fender fender) {

            totalWeight += 4;
    }

    @Override
    public void visit(PartOrder partOrder) {
        System.out.println("Total weight is:"+ totalWeight);
    }
}
