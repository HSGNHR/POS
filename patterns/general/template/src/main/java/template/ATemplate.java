package template;

public abstract class ATemplate {

  /**
   * template Method containing a final order of operations.
   */
  public final void templateMethod() {
    operation1();  
    operation2();
    operation3();
  }

  private final void operation1() {
    System.out.println("Operation1\n");
  }

  protected abstract void operation2();

  private final void operation3() {
    System.out.println("Operation3\n");
  }
}
