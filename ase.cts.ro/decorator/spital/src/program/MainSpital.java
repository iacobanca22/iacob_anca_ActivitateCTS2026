package program;
import clase.Rezultat;
import pattern.DecoratorRezultat;
import pattern.RezultatOnline;
import clase.RezultatPrintat;
public class MainSpital {
    public static void main(String[] args) {

        Rezultat rezultat = new RezultatPrintat();

        // adaugam functionalitate online
        rezultat = new RezultatOnline(rezultat);

        rezultat.afiseaza();
    }
}
