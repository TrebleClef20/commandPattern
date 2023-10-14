
public class Increase implements Command {

    private Appliance appliance;

    public Increase(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public String execute() {
        return appliance.increase();
    }
}
