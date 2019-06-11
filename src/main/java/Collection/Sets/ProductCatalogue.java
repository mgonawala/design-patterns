package Collection.Sets;

import Collection.Lists.Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalogue implements Iterable<Product> {


    Set<Product> productSet = new HashSet<>();

    public void isSuppliedBy(Supplier supplier){
        productSet.addAll(supplier.getProductList());
    }
    @Override
    public Iterator<Product> iterator() {
        return productSet.iterator();
    }
}
