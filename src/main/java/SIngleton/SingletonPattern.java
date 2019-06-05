package SIngleton;
// Singleton patter implementation
// Make Constructor private
// Declare an Instance variable and declare static.


// This pattern can be broken by clone method, reflection.
// This is early initialization.

public class SingletonPattern {

    public static SingletonPattern INSTANCE = new SingletonPattern();

    private SingletonPattern(){

    }
}
