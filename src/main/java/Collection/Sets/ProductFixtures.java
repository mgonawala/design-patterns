package Collection.Sets;

import Collection.Lists.Product;

public class ProductFixtures {

    public  static Supplier bobs = new Supplier("Bob");
    public static Supplier kates = new Supplier("Kates");

    public static Product window = new Product("Window",35);
    public static Product door = new Product("Door", 45);
    static {
        bobs.getProductList().add(window);
        bobs.getProductList().add(door);

        kates.getProductList().add(window);
        kates.getProductList().add(door);
    }

}
