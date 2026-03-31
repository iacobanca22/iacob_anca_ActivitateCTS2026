package clase;

public class LivrareWeekend extends DecoratorAbstractLivrare{
    public LivrareWeekend(ILivrare livrare) {
        super(livrare);
    }

    @Override
    public void tracking() {
        System.out.println("Tracking weekend activ");
    }

    @Override
    public double cost() {
        return super.cost();
    }

    @Override
    public String descriere() {
        return super.descriere() + "Livrarea se va face in Weekend";
    }
}
