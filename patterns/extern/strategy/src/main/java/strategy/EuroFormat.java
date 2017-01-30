package strategy;

public class EuroFormat implements IDatumsformat {
    public void datumAusgeben(int tag,int monat,int jahr){
        System.out.println("Europäisches Format: " + (tag > 9 ? tag : "0" + tag)
                                                   + "."
                                                   + (monat > 9 ? monat : "0" + monat)
                                                   + "."
                                                   + jahr);
    }
}
