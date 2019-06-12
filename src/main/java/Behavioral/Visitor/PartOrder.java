package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartOrder implements CarPart{

    private List<CarPart> parts = new ArrayList<>();

    public void addPart(CarPart part){
        parts.add(part);
    }

    public List<CarPart> getParts(){
        return Collections.unmodifiableList(parts);
    }

    @Override
    public void accept(PartVisitor partVisitor) {
        for (CarPart carPart :
                parts) {
            carPart.accept(partVisitor);
        }

        partVisitor.visit(this);
    }

    public double calculateShipping(){
        double shippingCost = 0.0;
        for (CarPart part :
                parts) {
            shippingCost += part.calculateShipping();
        }
        return shippingCost;
    }
}
