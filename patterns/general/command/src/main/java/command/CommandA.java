package command;

public class CommandA implements ICommand {
  Receiver receiver;

  public CommandA(Receiver receiver) {
    this.receiver = receiver;
  }

  public void execute() {
    receiver.action1();  
  }
}
