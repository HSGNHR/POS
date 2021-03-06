package weather;

public class Display2 implements IObserver {

  private ISubject subject;
  private float temperature; 
  private float humidity;
  private float pressure;

  public Display2(ISubject subject) {
    this.subject = subject;
    subject.addObserver(this);
  }

  public void update(float temperature, float humidity, float pressure){
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }

  public void display(){
    System.out.println("Display 2:\n");
    System.out.println("temperature: "+ temperature +", humidity: "+ humidity +", pressure: "+ pressure +"\n");
  }
}
