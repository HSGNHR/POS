package weather;
import java.util.ArrayList;

public class WeatherData implements ISubject {

  private ArrayList<IObserver> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData(){
    observers = new ArrayList<IObserver>();
  }

  public void addObserver(IObserver observer){
    observers.add(observer);
  }

  public void removeObserver(IObserver observer) {
      observers.remove(observer); 
    }
  
  public void notifyObservers(){
   for (IObserver observer : observers){
     observer.update(temperature, humidity, pressure);
   }
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public void measurementsChanged() {
    notifyObservers();
  }
}
