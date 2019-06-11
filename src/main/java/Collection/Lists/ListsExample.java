package Collection.Lists;

import javax.swing.*;

/**
 *
 * Preserves the insertion order.
 *
 * add(index)
 * remove ( index)
 * set( index, element)
 * addl( index, collection)
 *
 * Lookup:
 *
 * indexOf(element) -> returns only index of first occurrence
 * lastIndexOf(element)
 *
 * Sublist:
 *
 * sublist( from, to).
 * sublists are views over range of lists.
 * It means if you modify the list, it also modifies the views.
 * fromIndex is inclusive, toIndex is exclusive
 */
public class ListsExample {

    public static void main(String[] args) {
        Shipment shipment = new Shipment();

        Product door = new Product("Door",25);
        Product window = new Product("Window", 35);
        Product floorPanel = new Product("Floor Panel", 15);

        shipment.add(door).add(window).add(floorPanel);

        shipment.iterator().forEachRemaining(System.out::println);

        Product ceiling = new Product("Ceiling", 19);
        shipment.replace(floorPanel, ceiling);

        shipment.iterator().forEachRemaining(System.out::println);

        shipment.prepare();
        System.out.println(shipment.getHeavyWeightProducts());
        System.out.println(shipment.getLightWeightProducts());

    }
}
