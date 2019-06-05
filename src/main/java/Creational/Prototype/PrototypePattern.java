package Creational.Prototype;


/**
 *
 * This pattern relies on creating  a copy of the prototype instead of creating a new object instance.
 * It utilizes clone method to make copies of objects.
 *
 * It maintains prototypes in a Registry.
 * & returns a cloned object from the registry whenever creation is required.
 */

public class PrototypePattern {

    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = registry.createMovie();
        System.out.println(movie.hashCode());
        System.out.println(movie.getName());
        System.out.println(movie.getTime());
    }
}
