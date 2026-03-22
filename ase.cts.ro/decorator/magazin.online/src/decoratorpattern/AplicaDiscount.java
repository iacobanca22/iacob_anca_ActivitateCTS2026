package decoratorpattern;

import clase.Factura;

public class AplicaDiscount extends DecoratorFactura {
    public AplicaDiscount(Factura factura) {
        super(factura);
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Am aplicat discount");
    }
}
