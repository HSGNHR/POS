package abs_fact;

public class Start{
    
    public static void main(String args[]) {
        Client client = new Client();
        client.setFabrik(new KonkreteFabrik1());  
        client.produziere();
    }

}

