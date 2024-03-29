package Exc_8.Command;

public class TurnOnLightCommand implements Command {
    private final Light theLight;

    public TurnOnLightCommand(Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOn();
    }
}
