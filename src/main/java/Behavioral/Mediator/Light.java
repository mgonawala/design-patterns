package Behavioral.Mediator;

//Receiver
public class Light {

    private boolean isOn = false;

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void toggle(){
        if(isOn){
            off();
            isOn = false;
        }
        else {
            on();
            isOn = true;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    private void off(){
        System.out.println("Light is off.");
    }

    private void on(){
        System.out.println("Light is on.");
    }
}
