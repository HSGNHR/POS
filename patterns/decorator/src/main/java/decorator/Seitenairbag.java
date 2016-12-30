package decorator;
public class Seitenairbag extends Ausstattung {

    public Seitenairbag(IAuto pIAuto) {
        super(pIAuto);
    }
    public void zeigeDetails(){ // dekoriert die Details
    auto.zeigeDetails();
    System.out.println(", Seitenairbags");
    }

    public int gibKosten(){ // dekoriert die Kosten
    return auto.gibKosten() + 1000;
    }

}
