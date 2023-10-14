package src;
public class Thermostat implements Appliance {

    private Integer temp;

    @Override
    public String turnOn() {
        this.temp = 25;
        return "turning on the Thermostat.. Temperature is " + this.temp + " degrees celcius";
    }

    @Override
    public String turnOff() {
        return "Thermostat is off..";
    }

    @Override
    public String increase() {
        return "Increased! temp is now " + ++this.temp + " degrees celcius";
    }

    @Override
    public String decrease() {
        return "Decreased! temp is now " + --this.temp + " degrees celcius";
    }
}
