package clase;

abstract class DecoratorAbstractImprimare implements IImprimareStandard {
    protected IImprimareStandard document;

    public DecoratorAbstractImprimare(IImprimareStandard document) {
        this.document = document;
    }

    @Override
    public void print(String continut) {
        document.print(continut);
    }

    public abstract void salveaPDF(String continut);
}
