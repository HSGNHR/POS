package template;

public class Client {
  /**
   * generic template pattern implementation.
   */
  public static void main(String[] args) {
    ATemplate concreteA = new ConcreteA();
    concreteA.templateMethod();

    ATemplate concreteB = new ConcreteB();
    concreteB.templateMethod();
  }
}

