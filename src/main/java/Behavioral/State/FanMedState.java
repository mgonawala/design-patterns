package Behavioral.State;

public class FanMedState extends State {

    Fan fan;

    public FanMedState(Fan fan){
        this.fan = fan
                ;
    }

    @Override
    public void handleRequest() {
        System.out.println("Setting state to OFF.");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is Med.";
    }
}
