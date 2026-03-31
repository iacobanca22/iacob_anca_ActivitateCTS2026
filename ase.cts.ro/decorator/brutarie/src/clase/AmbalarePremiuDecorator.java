package clase;

public class AmbalarePremiuDecorator extends AbstractDecorator{

    public AmbalarePremiuDecorator(IProdusDeBaza produsDeBaza) {
        super(produsDeBaza);
    }

    @Override
    public String nume() {
        return produsDeBaza.nume()+ "cu ambalare premiu";
    }

    @Override
    public Double pret() {
        return produsDeBaza.pret()+3;
    }
}
