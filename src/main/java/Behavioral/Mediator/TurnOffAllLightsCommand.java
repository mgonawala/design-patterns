package Behavioral.Mediator;

public class TurnOffAllLightsCommand implements Command {

    Mediator mediator;

    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
