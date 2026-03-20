package pattern;
import clase.Rezultat;

public class DecoratorRezultat implements Rezultat{
    protected Rezultat rezultat;

    public DecoratorRezultat(Rezultat rezultat) {
        this.rezultat = rezultat;
    }


    @Override
    public void afiseaza() {
        rezultat.afiseaza();
    }
}
