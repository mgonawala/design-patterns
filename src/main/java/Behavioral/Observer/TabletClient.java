package Behavioral.Observer;

public class TabletClient extends Observer {

    Subject subject;

    public TabletClient(Subject subject){
        this.subject = subject;
        subject.addObserver(this);
    }


    @Override
    public void update() {
        System.out.println("TabletClient's update method is called : updated message /n"+subject.getMessage());

    }
}
