package strategy;

public class UsFormat implements IDatumsformat {
    public void datumAusgeben(int tag, int monat, int jahr){
        System.out.println("US Format: " 
                            + (monat > 9 ? monat : "0" + monat)
                            + "/"
                            + (tag > 9 ? tag : "0" + tag)
                            + "/"
                            + jahr);
    }
}
