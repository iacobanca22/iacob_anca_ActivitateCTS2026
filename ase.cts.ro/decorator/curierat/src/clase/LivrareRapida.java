package clase;

public class LivrareRapida extends DecoratorAbstractLivrare{


    public LivrareRapida(ILivrare livrare) {
        super(livrare);
    }

    @Override
    public String descriere() {
        return livrare.descriere()+ " Livrare rapida";
    }

    @Override
    public double cost() {
        return livrare.cost()+25;
    }

    @Override
    public void tracking() {
        System.out.println("Tracking rapid activ");
    }
}
