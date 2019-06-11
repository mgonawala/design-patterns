package Collection.MapExamples;

import Collection.Lists.Product;
import Collection.Sets.ProductFixtures;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Association between values is described by Map.
 *
 * Map has unique keys.
 *
 * Values have no uniqueness constraint.
 *
 * keySet(), values(), entrySet() are views of Map.
 *
 * remove operation from views are allows but add operation is not valid
 * & throws unsupportedexception
 *
 *
 * SortedMap views: ( any change to views also reflect in the original collection)
 *
 * headMap(tokey)
 * trailMap(fromKey)
 * subMap(from, tokey)
 *
 *
 * Navigable Map methods:
 *
 * pollFirstEntry() -> removes the element as well as returning it.
 * pollLastentry() -> removes teh element as well as returning it.
 *
 *
 * lowerKey( key ) -> greatest key lower than given key
 * higherKey( key ) -> least key greater than given key.
 *
 * floorKey(key) -> greatert key lower or equal to given key
 * ceilingKey(key) -> least key greater or equal to given key.
 *
 *
 * reversing the order of the Map.
 *
 * descendingMap()
 * descendingKeySet()
 * navigableKeySer()
 *
 * Java 8 has a lot of enhancements in Map.
 *
 *  new getOrDefault method.
 *
 *  replave method will replace value at the specified key onluy if key is present in the map.
 *
 *  replaceALl method will replace value at each key , with the specified value.
 *
 *  compute method.
 *
 *  it provides forEach method to iterate over a Map. So no need to iterate over keyset or values like earler.
 */
public class MapExmample {

    public static void main(String[] args) {
        Product defaultProduct = new Product("default product",0);

        Map<Integer, Product> productMap = new HashMap<>();

        productMap.put(1, ProductFixtures.window);
        productMap.put(2, ProductFixtures.door);


        // use of getOrDefault method introduced in Java 8.
        System.out.println(productMap.getOrDefault(10, defaultProduct));

        // used of replace operation.
        productMap.replace(1, new Product("New Big Window", 30));
        System.out.println(productMap);

        // use of repalceALl
        productMap.replaceAll((id, oldProduct) -> {
            return new Product(id.toString(), oldProduct.getWeight() + 10);
        });

        System.out.println(productMap);

        // This will compute a new value is key 10 is absent and put in the map.
        productMap.computeIfAbsent( 10, (id) ->  new Product(id.toString(),20));
        System.out.println(productMap);

        // This will compute a new value if key is absent, otherwise just return the value.

        productMap.compute(10, (id, value) -> new Product(id.toString(),20));
        System.out.println(productMap);

        productMap.compute(11, (id, value) -> new Product(id.toString(),20));
        System.out.println(productMap);

    }
}
