package adapterobj;

public class Client {
  public static void main(String[] args) {
    ITarget testTarget = new Target();
    testTarget.operationA();

    Adaptee testAdaptee = new Adaptee();
    testAdaptee.operationB(); //call without adapter

    ITarget testAdapter = new Adapter(testAdaptee);
    testAdapter.operationA(); //call with adapter
  }
}

