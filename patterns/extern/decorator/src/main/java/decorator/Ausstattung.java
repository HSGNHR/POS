package decorator;

public abstract class Ausstattung implements IAuto {
    protected IAuto auto;

    public Ausstattung(IAuto pIAuto){
        auto = pIAuto;
    }
}
