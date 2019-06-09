package Behavioral.Observer;

public class PhoneClient extends Observer {

    Subject subject;

    public PhoneClient(Subject subject){
        this.subject = subject;
        subject.addObserver(this);

    }

    @Override
    public void update() {
        System.out.println("PhoneClient's update method is called.: state chagned is- /n"+subject.getMessage());
    }
}
