package program.felicitare;
import decoratorpattern.AmbalareCadou;
import decoratorpattern.AplicaDiscount;
import decoratorpattern.MesajPromo;
import clase.Factura;
import clase.FacturaStandard;


public class MainFelicitare {
    public static void main(String[] args) {

        Factura factura = new FacturaStandard();
        factura = new AplicaDiscount(factura);
        factura = new AmbalareCadou(factura);
        factura = new MesajPromo(factura);
        factura.afiseaza();
    }
}
