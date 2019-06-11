package Collection.Sets;

import Collection.Lists.Product;

import java.util.LinkedList;
import java.util.List;

public class Supplier {

    private String name;

    private List<Product> productList = new LinkedList<>();

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
