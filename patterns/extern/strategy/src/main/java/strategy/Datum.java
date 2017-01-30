package strategy;

public class Datum {
    private IDatumsformat format = null;
    private int tag, monat, jahr = 0;
    
    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;

    }
    public void setzeFormat(IDatumsformat format){
        this.format = format;
    }
    public void ausgeben(){
        format.datumAusgeben(tag, monat, jahr);
    }
}
