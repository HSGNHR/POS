package absfactory;

public class ConcreteFactory2 implements IAbstractFactory {

  public IAbstractProductA createProductA() {
    return new ConcreteProductA2();
  }

  public IAbstractProductB createProductB() {
    return new ConcreteProductB2();
  }
}
