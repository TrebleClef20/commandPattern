package src;

public class TurnOff implements Command {

    private Appliance appliance;

    public TurnOff(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public String execute() {
        return appliance.turnOff();
    }
}
