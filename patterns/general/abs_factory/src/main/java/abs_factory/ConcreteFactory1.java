package absfactory;

public class ConcreteFactory1 implements IAbstractFactory {

  public IAbstractProductA createProductA() {
    return new ConcreteProductA1();
  }

  public IAbstractProductB createProductB() {
    return new ConcreteProductB1();
  }
}
