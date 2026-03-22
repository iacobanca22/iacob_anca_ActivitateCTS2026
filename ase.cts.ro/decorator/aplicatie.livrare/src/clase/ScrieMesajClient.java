package clase;

public class ScrieMesajClient extends Decorator{
    public ScrieMesajClient(GenereazaBon print) {
        super(print);
    }

    @Override
    public void genereazaBon() {
        super.genereazaBon();
        System.out.println(" Am scris mesaj catre client");
    }
}
