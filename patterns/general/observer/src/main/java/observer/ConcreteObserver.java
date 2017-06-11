package observer;

public class ConcreteObserver implements IObserver {
  private ISubject subject;

  public ConcreteObserver(ISubject subject) {
    this.subject = subject;
    subject.addObserver(this);
  }

  public void update(String pushdata) {
    System.out.println(pushdata);
  }
}
