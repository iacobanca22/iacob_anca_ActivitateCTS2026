package clase;

public class LivrareAsigurare extends DecoratorAbstractLivrare{
    public LivrareAsigurare(ILivrare livrare) {
        super(livrare);
    }

    @Override
    public String descriere() {
        return super.descriere() + "Livrare cu Asigurare";
    }

    @Override
    public double cost() {
        return super.cost()+10;
    }

    @Override
    public void tracking() {
        System.out.println("Traking pentru livrare cu asigurare");
    }

    }

