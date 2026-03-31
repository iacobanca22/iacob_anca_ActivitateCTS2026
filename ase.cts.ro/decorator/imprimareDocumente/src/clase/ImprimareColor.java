package clase;

public class ImprimareColor extends DecoratorAbstractImprimare{

    public ImprimareColor(IImprimareStandard document) {
        super(document);
    }

    @Override
    public void print(String continut) {
        super.print("[color]"+continut);
    }

    @Override
    public void salveaPDF(String continut) {
    System.out.println("Salveaza color si in pdf"+continut);
    }
}
