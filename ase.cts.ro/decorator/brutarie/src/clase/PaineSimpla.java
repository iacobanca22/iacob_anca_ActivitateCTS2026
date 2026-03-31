package clase;

public class PaineSimpla implements IProdusDeBaza {
    public PaineSimpla() {
        super();
    }

    @Override
    public String nume() {
        return "Paine simpla";
    }

    @Override
    public Double pret() {
        return 5.0;
    }

    }
