package command;

public class LightOnCommand implements Command {

    private Light myLight;
    public LightOnCommand(Light l){
        myLight = l;
    }
    public void execute(){
        myLight.turnOn();
    }
}
