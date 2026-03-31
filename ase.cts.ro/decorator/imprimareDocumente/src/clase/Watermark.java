package clase;

public class Watermark extends DecoratorAbstractImprimare{
    public Watermark(IImprimareStandard document) {
        super(document);
    }

    @Override
    public void print(String continut) {
        super.print("[watermark]"+continut);
    }

    @Override
    public void salveaPDF(String continut) {
        System.out.println("Printare eatermark si salveaPDF"+continut);

    }
}
