package composite;

import java.util.Iterator;
import java.util.ArrayList;
public class Composite extends AComponent {
  ArrayList<AComponent> children = new ArrayList<AComponent>();
  /**
   * delegate operation to every child.
   */
  public void operation() {
    Iterator<AComponent> iterator = children.iterator();
    while(iterator.hasNext()){
      AComponent child = (AComponent) iterator.next();
      child.operation();
    }
  }

  public void add(AComponent component) {
    this.children.add(component);
  }

  /**
   * remove given component from any position recursively.
   */
  public void remove(AComponent component) {
    //iterate through all children
    Iterator<AComponent> iterator = children.iterator();
    while(iterator.hasNext()){
      AComponent child = (AComponent) iterator.next();
      if (child instanceof Composite) {
        ((Composite) child).remove(component);
      }
    }
    //this is the ArrayList remove
    this.children.remove(component);
  }
}
