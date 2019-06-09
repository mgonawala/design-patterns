package Behavioral.State;

public class FanLowState extends State {

    Fan fan;

    public FanLowState(Fan fan){
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        //
        System.out.println("Turning state of FAN to Med.");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is LOW.";
    }
}
