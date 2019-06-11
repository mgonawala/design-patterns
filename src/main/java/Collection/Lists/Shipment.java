package Collection.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Example to demonstrate List collection
 */
public class Shipment implements Iterable<Product>{

    private static  final int LIGHT_VAN_MAX_WEIGHT = 20;
    public static final int PRODUCT_NOT_PRESENT = -1;

    List<Product> heavyWeightProducts = new ArrayList<>();
    List<Product> lightWeightProducts = new ArrayList<>();

    private List<Product> products = new ArrayList<>();

    public Shipment add(Product product){
        products.add(product);
        return this;
    }

    public void replace(Product oldProduct, Product newProduct){
        int index = products.indexOf(oldProduct);
        if( index
        != PRODUCT_NOT_PRESENT){
            products.set(index,newProduct);
        }

    }

    public void prepare(){
        // SOrt our products by weight.

        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
        // find the product index  that needs the heavy van.

        int splitIndex = 0;
        for (int i =0; i<products.size(); i++){
            if( products.get(i).getWeight() > LIGHT_VAN_MAX_WEIGHT){
                splitIndex = i;
            }
        }
        // Then assign views of the product list for heavy and light van.
        lightWeightProducts =  products.subList(0,splitIndex);
        heavyWeightProducts = products.subList(splitIndex, products.size());

    }

    public List<Product> getHeavyWeightProducts() {
        return heavyWeightProducts;
    }

    public List<Product> getLightWeightProducts() {
        return lightWeightProducts;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
