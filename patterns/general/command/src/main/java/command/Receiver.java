package command;

public class Receiver {
  public void action1() {
    System.out.println("Receiver action1 executed via Invoker -> CommandA\n");
  }

  public void action2() {
    System.out.println("Receiver action1 executed via Invoker -> CommandB\n");
  }
}
