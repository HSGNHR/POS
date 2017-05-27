package weather;

public class Start {
  public static void main(String[] args) {
    WeatherData testData = new WeatherData();
    testData.setMeasurements(10, 20, 30);

    IObserver Display1 = new Display1(testData);
    testData.setMeasurements(11, 22, 33);
  }
}

