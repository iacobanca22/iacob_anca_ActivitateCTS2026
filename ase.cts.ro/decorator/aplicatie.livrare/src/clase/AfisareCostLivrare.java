package clase;

public class AfisareCostLivrare extends Decorator{

    public AfisareCostLivrare(GenereazaBon print) {
        super(print);
    }

    @Override
    public void genereazaBon() {
        super.genereazaBon();
        System.out.println("Am afisat cost livrare");
    }
}
