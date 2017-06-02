package iterator;

public class IteratorA implements IIterator {
  Element[] elements;
  int position = 0;

  public IteratorA(Element[] elements) {
    this.elements = elements;
  }

  public boolean hasNext() {
    if((position >= elements.length) || (elements[position] == null)) {
      return false;
    }
    else {
      return true;
    }
  }

  public Object next() {
    return elements[position++];
  }
  
}
