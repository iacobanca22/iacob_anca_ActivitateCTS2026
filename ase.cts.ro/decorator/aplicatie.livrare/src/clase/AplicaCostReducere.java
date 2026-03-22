package clase;

public class AplicaCostReducere extends Decorator{
    public AplicaCostReducere(GenereazaBon print) {
        super(print);
    }

    @Override
    public void genereazaBon() {
        super.genereazaBon();
        System.out.println("Am aplicat cost reducere");
    }
}
