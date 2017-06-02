package iterator;

public class Client {
  public static void main(String[] args) {
    AggregateA aggregateA = new AggregateA(); 
    Element firstElement = new Element(1);  
    Element secondElement = new Element(2);  
    aggregateA.add(firstElement);
    aggregateA.add(secondElement);

    IIterator iteratorA = aggregateA.createIterator();
    while(iteratorA.hasNext()){
      System.out.println("next element");
      Element current = (Element)iteratorA.next();
      current.operation();
    }
  }
}

