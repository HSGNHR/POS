package strategy;
public class Start{
    public static void main(String args[]) {
      Datum datum = new Datum(21, 9, 1985);
      datum.setzeFormat(new EuroFormat());
      datum.ausgeben();

      datum.setzeFormat(new UsFormat());
      datum.ausgeben(); 
    }
}

