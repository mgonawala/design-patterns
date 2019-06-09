package Behavioral.Observer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public abstract class Subject {

    List<Observer> observerList = new ArrayList<>();

    Deque<String> state = new ArrayDeque<String>();

    public void addObserver(Observer observer){
        this.observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observerList.remove(observer);
    }
    public void addMessage(String message){
        this.state.add(message);
        this.notifyObservers();
    }

    public void removeMessage(String message){
        this.state.remove(message);
        this.notifyObservers();
    }

    public void notifyObservers(){
        for (Observer observer :
             observerList) {
            observer.update();
        }
    }
    public abstract  String getMessage();

    }
