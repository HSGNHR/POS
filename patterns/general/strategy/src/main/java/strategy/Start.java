package strategy;

public class Start {
  /**
   * generic strategy pattern implementation.
   */
  public static void main(String[] args) {
    Context context = new Context();
    context.setStrategy(new Strategy1());
    context.callStrategy();

    context.setStrategy(new Strategy2());
    context.callStrategy(); 
  }
}

