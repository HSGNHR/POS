package adapterobj;

public class Adapter implements ITarget {
  
  Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  public void operationA() {
    adaptee.operationB();
  }
}
