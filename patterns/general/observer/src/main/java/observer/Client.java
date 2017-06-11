package observer;

public class Client {
  public static void main(String[] args) {
    ConcreteSubject testSubject = new ConcreteSubject();
    testSubject.setState("initital state");
    IObserver testObserver = new ConcreteObserver(testSubject);
    testSubject.setState("updated state");
  }
}

