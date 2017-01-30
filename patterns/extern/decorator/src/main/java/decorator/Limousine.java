package decorator;

public class Limousine implements IAuto {

    public void zeigeDetails(){
        System.out.println("Limousine");
    }
        
    public int gibKosten(){
        return 35000;
    }
}
