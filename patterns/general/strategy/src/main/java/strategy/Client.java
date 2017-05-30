package strategy;

public class Client {
  /**
   * generic strategy pattern implementation.
   */
  public static void main(String[] args) {
    Context context = new Context();
    context.setStrategy(new StrategyA());
    context.callStrategy();

    context.setStrategy(new StrategyB());
    context.callStrategy(); 
  }
}

