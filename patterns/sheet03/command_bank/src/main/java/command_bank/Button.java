package command_bank;

public class Button {
    private Command excommand;

    
    public Button(Command cmd){
        excommand = cmd;
    }

    public void press(){
        excommand.execute();
    }
}
