package Behavioral.Mediator;

public class TurnOnAllLightsCommand implements Command {

    Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
            mediator.turnOnAllLights();
    }
}
