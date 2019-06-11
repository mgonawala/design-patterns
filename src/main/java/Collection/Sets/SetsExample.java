package Collection.Sets;

/**
 *
 * Allows only unique elements.
 *
 * HashSet, TreeSet, EnumSet, LinkesHashSet are Set Implementations
 *
 * HashSet -> Stores its values in a hashmap.
 *      calls hashcode on element & lookup the location.
 *      it resizes when run out of space.
 * TreeSet -> Stores elements in red black tree, and orders its elements based on their values.
 *        based on TreeMap.
 * LinkedHashSet -> Implemented as a hashTable with a linkedlist running thourgh it orders its elemtnts based on
 *          insertion order.
 *
 *
 *
 *
 */
public class SetsExample {

    public static void main(String[] args) {
        ProductCatalogue products = new ProductCatalogue();
        products.isSuppliedBy(ProductFixtures.bobs);
        products.isSuppliedBy(ProductFixtures.kates);

        System.out.println(products.productSet);
    }
}
