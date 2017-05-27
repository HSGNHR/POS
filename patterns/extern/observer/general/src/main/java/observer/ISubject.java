package observer;

public interface ISubject {
  public void registerObserver();

  public void removeObserver();

  public void notifyObservers();
}
