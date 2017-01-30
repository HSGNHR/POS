package decorator;

public class Client {
    // Auto mit Klimaanlage
    public static void main(String args[]){
    IAuto auto = new Klimaanlage(new Limousine());
    auto.zeigeDetails();
    System.out.println("\nfuer "+ auto.gibKosten() +" Euro\n");

    // dynamische Erweiterung der Limousine mit Ausstattungen
    auto = new Seitenairbag(auto); 
    auto.zeigeDetails();
    System.out.println("\nfuer "+ auto.gibKosten() +" Euro\n");
    }

}
