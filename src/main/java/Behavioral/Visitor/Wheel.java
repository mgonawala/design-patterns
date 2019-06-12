package Behavioral.Visitor;

public class Wheel implements CarPart {

    @Override
    public void accept(PartVisitor partVisitor) {
         partVisitor.visit(this);
    }

    @Override
    public double calculateShipping() {
        return 12;
    }
}
