package clase;

public abstract class AbstractDecorator implements IProdusDeBaza{
    protected IProdusDeBaza produsDeBaza;

    public AbstractDecorator(IProdusDeBaza produsDeBaza) {
        this.produsDeBaza = produsDeBaza;
    }

    @Override
    public String nume() {
        return produsDeBaza.nume();
    }

    @Override
    public Double pret() {
        return produsDeBaza.pret();
    }

}
