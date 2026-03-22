package decoratorpattern;
import clase.Factura;
import clase.FacturaStandard;

public abstract class DecoratorFactura implements Factura {
    protected Factura factura;

    public DecoratorFactura(Factura factura) {
        this.factura = factura;
    }


    @Override
    public void afiseaza() {
        factura.afiseaza();
    }
}
