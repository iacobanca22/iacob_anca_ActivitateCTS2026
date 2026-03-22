package decoratorpattern;
import clase.Factura;

public class AmbalareCadou extends DecoratorFactura {
    public AmbalareCadou(Factura factura) {
        super(factura);
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Am facut ambalarea");
    }
}
