package Behavioral.State;

/**
 *
 * Each state is a class based and represents it's state.
 *
 * It's made of Context, State and individual concreteState class.
 *
 * When you want to perform some operation that depends on the state of the object.
 * This pattern comes into the picture.
 *
 * ex. Pull chain operation of FAN.
 *
 * if FAN is off, it will make it Low, it its low it will make it Medium, if
 * its' Medium, it's set to Low. It has a lot of if else conditions & make
 * it difficult to add new State.
 *
 *
 */
public class StatePattern {

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.pullChain();
        System.out.println(fan.toString());
        fan.pullChain();
        System.out.println(fan.toString());
        fan.pullChain();
        System.out.println(fan.toString());
    }
}
