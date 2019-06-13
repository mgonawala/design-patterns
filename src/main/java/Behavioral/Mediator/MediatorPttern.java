package Behavioral.Mediator;

/**
 *
 * is used to define how objects interact with one another
 * without having them refer to each other explicitly.
 *
 * it allows to achieve loose coupling between objects.
 *
 * Example:
 *
 * java.util.Timer class
 *
 * Design:
 * Mediator knows all the colleagues rather than
 * all the colleagues know about each other.
 *
 * Mediator, ConcreteMediator.
 *
 * Real world example of mediator pattern is traffic control room at airport.
 * If all the flights will have to interact with each other to find out which flight
 * will land next, it will be a big mess.
 *
 */
public class MediatorPttern {

    public static void main(String[] args) {
        Light kitchenLight = new Light("Kitchen");
        Light bedRoomLight = new Light("Bedroom");

        Mediator mediator = new Mediator();
        mediator.registerLight(kitchenLight);
        mediator.registerLight(bedRoomLight);

        Command turnOnAll  = new TurnOnAllLightsCommand(mediator);
        Command turnOfAll = new TurnOffAllLightsCommand(mediator);

        turnOnAll.execute();
        turnOfAll.execute();

    }
}
