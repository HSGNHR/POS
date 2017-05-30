package template;

public class Client {
  /**
   * generic template pattern implementation.
   */
  public static void main(String[] args) {
    ConcreteClass concrete = new ConcreteClass();
    concrete.templateMethod();
  }
}

