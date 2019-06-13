package Structural.Flyweight;



/**
 *
 * It minimizes memory use by sharing data between similarly typed objects.
 *
 * Flyweight, ConcreteFlyweight, Client, factory
 */
public class FlyweightPattern {

    public static void main(String[] args) {

        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Bose",1);
        inventorySystem.takeOrder("Bose",2);

        inventorySystem.processOrder();
        System.out.println(inventorySystem.totalObjects());
    }
}
