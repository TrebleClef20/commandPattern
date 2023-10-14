
public class TurnOn implements Command {

    private Appliance appliance;

    public TurnOn(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public String execute() {
        return appliance.turnOn();
    }
}
