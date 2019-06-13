package Structural.Flyweight;



import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orderList = new CopyOnWriteArrayList<>();

    void takeOrder(String itemName, int orderNumber){
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber,item);
        orderList.add(order);
    }

    void processOrder(){
        orderList.forEach(order -> {
            order.processOrder(); orderList.remove(order);
        });
    }

    public  int totalObjects(){
        return catalog.totalItems();
    }
}
