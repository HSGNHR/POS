package iterator;

public class AggregateA implements IAggregate {
  private final int MAX = 10;
  private Element[] elements = new Element[MAX];
  private int position = 0;
  
  public IIterator createIterator() {
    return new IteratorA(elements);
  }

  public void add(Element element) {
    if(position < (MAX)) {
      elements[position++] = element;
    }
  }
}

