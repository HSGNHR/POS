package decorator;

public class Klimaanlage extends Ausstattung {

    public Klimaanlage(IAuto pIAuto) {
           super(pIAuto); 
    }
    
    public void zeigeDetails() { //dekoriert die Details
    
        auto.zeigeDetails();
        System.out.println(", Klimaanlage");
    }
    public int gibKosten() { //dekoriert die Kosten
    return auto.gibKosten() + 1500;
    }
}

