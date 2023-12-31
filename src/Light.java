package src;

public class Light implements Appliance {

    private Integer brightness;

    @Override
    public String turnOn() {
        this.brightness = 5;
        return "turning on the Light.. Brightness is changed to Level " + this.brightness;
    }

    @Override
    public String turnOff() {
        return "Light is now off..";
    }

    @Override
    public String increase() {
        return "Increased! brightness is now Level " + ++this.brightness;
    }

    @Override
    public String decrease() {
        return "Decreased! brightness is now Level " + --this.brightness;
    }
}
