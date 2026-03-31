package clase;

public abstract class DecoratorAbstractLivrare implements ILivrare {
    protected ILivrare livrare;

    public DecoratorAbstractLivrare(ILivrare livrare) {
        this.livrare = livrare;
    }

    @Override
    public String descriere() {
        return livrare.descriere();
    }

    @Override
    public double cost() {
        return livrare.cost();
    }
    public abstract void tracking ();

}

