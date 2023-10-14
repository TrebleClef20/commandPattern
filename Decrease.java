

public class Decrease implements Command {

    private Appliance appliance;

    public Decrease(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public String execute() {
        return appliance.decrease();
    }
}
