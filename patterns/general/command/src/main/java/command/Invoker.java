package command;

public class Invoker {
  private ICommand command;

  public void setCommand(ICommand command) {
    this.command = command;
  }

  public void activate() {
    command.execute();
  }
}
