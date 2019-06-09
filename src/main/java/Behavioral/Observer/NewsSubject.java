package Behavioral.Observer;

public class NewsSubject extends Subject {

    @Override
    public String getMessage() {
        return this.state.getLast();
    }
}
