package Structural.Flyweight;

public class Order {

    private int orderNumber;

    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder(){
        System.out.println(" Ordering Item " + item.toString() + " for order number "+ orderNumber);
    }
}
