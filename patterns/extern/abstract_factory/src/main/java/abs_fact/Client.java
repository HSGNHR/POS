package abs_fact;

public class Client {
    private IAbstrakteFabrik fabrik = null;
    
    public void setFabrik(IAbstrakteFabrik fabrik){
        this.fabrik = fabrik;
    }

    public void produziere(){
        fabrik.erzeugeProduktA();
        fabrik.erzeugeProduktB();
    }
}
