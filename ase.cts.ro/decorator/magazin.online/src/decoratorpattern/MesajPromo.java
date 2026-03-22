package decoratorpattern;

import clase.Factura;

public class MesajPromo extends DecoratorFactura{

    public MesajPromo(Factura factura) {
        super(factura);
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println(" Va multumimi pentru cumparaturi");
    }

}
