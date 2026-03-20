package pattern;
import clase.Rezultat;

public class RezultatOnline extends DecoratorRezultat {

    public RezultatOnline(Rezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Rezultatul este disponibil online.");
    }
}