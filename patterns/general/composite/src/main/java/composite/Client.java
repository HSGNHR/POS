package composite;

public class Client {
  /**
   * generic composite pattern implementation.
   */
  public static void main(String[] args) {
    Composite compositeRoot = new Composite(); 
    Composite composite11 = new Composite();  
    Composite composite12 = new Composite();
    compositeRoot.add(composite11);
    Leaf leaf111 = new Leaf();
    composite11.add(leaf111);
    compositeRoot.operation();
    compositeRoot.remove(composite11); 
    compositeRoot.operation();
  }
}

