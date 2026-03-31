package clase;

public class CuSeminteDecorator extends AbstractDecorator{


    public CuSeminteDecorator(IProdusDeBaza produsDeBaza) {
        super(produsDeBaza);
    }

    @Override
    public Double pret() {
        return produsDeBaza.pret()+5;
    }

    @Override
    public String nume() {
        return produsDeBaza.nume()+" cu seminte";
    }
}
