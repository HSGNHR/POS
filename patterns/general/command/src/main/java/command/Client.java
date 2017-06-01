package command;

public class Client {
  /**
   * generic command pattern implementation.class
   */
  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    ICommand commandA = new CommandA(receiver);
    Invoker invoker = new Invoker();
    invoker.setCommand(commandA);
    invoker.activate();
    ICommand commandB = new CommandB(receiver);
    invoker.setCommand(commandB); 
    invoker.activate();
  }
}

