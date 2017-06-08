package composite;

import java.util.ArrayList;

public abstract class AComponent {

  ArrayList<AComponent> children = new ArrayList<AComponent>();

  public abstract void operation();
  
  public void add(AComponent component) {
    System.out.println("Child method not implemented.");
  }

  public void remove(AComponent component) {
    System.out.println("Child method not implemented.");
  }

  public void getChild() {
    System.out.println("Child method not implemented.");
  }
}
