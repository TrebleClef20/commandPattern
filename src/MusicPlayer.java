package src;
public class MusicPlayer implements Appliance {

    private Integer volume;

    @Override
    public String turnOn() {
        this.volume = 10;
        return "turning on the Music Player.. Playing 'You are the One' with volume " + this.volume;
    }

    @Override
    public String turnOff() {
        return "Music Player is off..";
    }

    @Override
    public String increase() {
        return "Increased! volume = " + ++this.volume;
    }

    @Override
    public String decrease() {
        return "Decreased! volume = " + --this.volume;
    }
}
