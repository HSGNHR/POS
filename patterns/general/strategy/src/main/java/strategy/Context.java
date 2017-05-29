package strategy;

public class Context {
  private IStrategy strategy = null;
    
  public void setStrategy(IStrategy strategy) {
    this.strategy = strategy;
  }

  public void callStrategy() {
    strategy.algorithm();
  }
}
