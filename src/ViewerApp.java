package src;
public class ViewerApp {

    public static void main(String[] args) {

        // instantiate all the appliances
        Appliance thermostat = new Thermostat();
        Appliance light = new Light();
        Appliance musicPlayer = new MusicPlayer();

        // instantiate all their commands

        // Thermostat
        TurnOn thermostatOn = new TurnOn(thermostat);
        TurnOff thermostatOff = new TurnOff(thermostat);
        Increase incrTemp = new Increase(thermostat);
        Decrease decrTemp = new Decrease(thermostat);

        // Light
        TurnOn lightOn = new TurnOn(light);
        TurnOff lightOff = new TurnOff(light);
        Increase incrbright = new Increase(light);
        Decrease decrbright = new Decrease(light);

        // Music Player
        TurnOn musicOn = new TurnOn(musicPlayer);
        TurnOff musicOff = new TurnOff(musicPlayer);
        Increase incrVol = new Increase(musicPlayer);
        Decrease decrVol = new Decrease(musicPlayer);

        // Creates a central app for controlling
        CentralHub centralHub = new CentralHub();

        // turns on all the Appliances
        System.out.println("\nTurns on all the Appliances\n");

        for (TurnOn turnOn : new TurnOn[] { thermostatOn, lightOn, musicOn }) {
            centralHub.setCommand(turnOn);
            centralHub.clickButton();
        }

        System.out.println("\nAdjusts volumes, temperature and brightness\n");

        // Modify somethings
        centralHub.setCommand(incrVol);
        centralHub.clickButton();
        centralHub.clickButton();
        centralHub.setCommand(decrVol);
        centralHub.clickButton();
        System.out.println();

        centralHub.setCommand(decrTemp);
        for (int i = 0; i < 7; i++) {
            centralHub.clickButton();
        }
        centralHub.setCommand(incrTemp);
        centralHub.clickButton();
        System.out.println();

        centralHub.setCommand(incrbright);
        centralHub.clickButton();
        centralHub.setCommand(decrbright);
        centralHub.clickButton();

        // turns off all the Appliances
        System.out.println("\nTurns off all the Appliances\n");

        centralHub.setCommand(thermostatOff);
        centralHub.clickButton();

        centralHub.setCommand(lightOff);
        centralHub.clickButton();

        centralHub.setCommand(musicOff);
        centralHub.clickButton();
        System.out.println();
    }
}
