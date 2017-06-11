package absfactory;

public class Client {
  /**
   * generic abstract factory pattern implementation.
   */
  public static void main(String[] args) {
    IAbstractFactory factory1 = new ConcreteFactory1();
    IAbstractProductA productA1 = factory1.createProductA();
    IAbstractProductB productB1 = factory1.createProductB();
    productA1.print();
    productB1.print();

    IAbstractFactory factory2 = new ConcreteFactory2();
    IAbstractProductA productA2 = new ConcreteProductA2();
    IAbstractProductB productB2 = new ConcreteProductB2();
    productA2.print();
    productB2.print();
  }
}

