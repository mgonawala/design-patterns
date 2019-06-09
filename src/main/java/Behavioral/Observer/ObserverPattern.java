package Behavioral.Observer;



/**
 * This pattern is used when we have a  subject to observe by different observers.
 *
 * A subject has one to many observers
 *
 * It is often used in Problems as Event handling.
 *
 * Example: java.util.Observer, java.util.EventListener, java.jms.topic
 *
 * It's made of Subject, ConcreteSubject, Observer, ConcreteObserver
 */
public class ObserverPattern {

    public static void main(String[] args) {

        NewsSubject newsSubject = new NewsSubject();

        PhoneClient phoneClient = new PhoneClient(newsSubject);
        TabletClient tabletClient = new TabletClient(newsSubject);

        newsSubject.addMessage("Added News. Let's see if it reaches or not");
        newsSubject.addMessage("second message");
    }
}
