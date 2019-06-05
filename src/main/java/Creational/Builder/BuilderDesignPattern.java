package Creational.Builder;

/**
 * Used to create complex objects which require lot of constructor arguments
 * or setter methods.
 *
 * It is often used to enforce immutability to the object.
 *
 * Example: StringBuilder, DocumentBuilder, Locale.Builder
 *
 * It also resolves the problem of telescoping constructors.
 * Where people often create lot of constructors to enforce different object contracts.
 *
 * A builder is responsible to return the Product object.
 * A builder has all the segments of the product.
 * & exposes interface to set required segments.
 * & & builds & returns the Product object according to all segments that are set.
 *
 */
public class BuilderDesignPattern {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("chicken").dressing("honey");

        LunchOrder sandwich = builder.buildSandwich();
        System.out.println(sandwich.toString());

    }
}
