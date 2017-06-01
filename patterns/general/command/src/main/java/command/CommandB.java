package command;

public class CommandB implements ICommand {
  Receiver receiver;

  public CommandB(Receiver receiver) {
    this.receiver = receiver;
  }

  public void execute() {
    receiver.action2();  
  }
}
