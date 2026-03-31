package clase;

public class ImprimareDublex extends DecoratorAbstractImprimare{
    public ImprimareDublex(IImprimareStandard document) {
        super(document);
    }

    @Override
    public void print(String continut) {
        super.print("[Imprimare duplex]"+continut);
    }

    @Override
    public void salveaPDF(String continut) {
        System.out.println("Printare duplex si salveaPDF"+continut);

    }
}
