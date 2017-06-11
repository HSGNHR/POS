package observer;

import java.util.ArrayList;

public class ConcreteSubject implements ISubject {
  private String state;
  ArrayList<IObserver> observerlist = new ArrayList<IObserver>();

  public void addObserver(IObserver observer) {
    observerlist.add(observer);
  }

  public void removeObserver(IObserver observer){
    observerlist.remove(observer);
  }

  private void notifyObservers() {
    for(IObserver observer : observerlist){
      observer.update(state);
    }
  }

  public void getState() {

  }

  public void setState(String state) {
    this.state = state; 
    this.notifyObservers();
  }
}
