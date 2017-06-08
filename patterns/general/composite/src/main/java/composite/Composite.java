package composite;

import java.util.Iterator;

public class Composite extends AComponent {
  /**
   * delegate operation to every child.
   */
  public void operation() {
    for (Iterator<AComponent> iterator = children.iterator(); iterator.hasNext();) {
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
    for (Iterator<AComponent> iterator = children.iterator(); iterator.hasNext();) {
      AComponent child = (AComponent) iterator.next();
      if (child instanceof Composite) {
        ((Composite) child).remove(component);
      }
    }
    //this is the ArrayList remove
    children.remove(component);
  }
}
