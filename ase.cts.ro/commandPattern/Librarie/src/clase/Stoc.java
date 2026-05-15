package clase;
import java.util.ArrayList;
import java.util.List;

public class Stoc {
    private List<Carte> carti;

    public Stoc() {
        carti = new ArrayList<>();
    }

    public void adaugaCarte(Carte carte) {
        carti.add(carte);
        System.out.println("Adaugata cartea: " + carte.getTitlu());
    }

    public void stergeCarte(Carte carte) {
        carti.remove(carte);
        System.out.println("Stearsa cartea: " + carte.getTitlu());
    }

    public void anulareAdaugare(Carte carte) {
        carti.remove(carte);
        System.out.println("Anulata adaugarea cartii: " + carte.getTitlu());
    }

    public void anulareSterge(Carte carte) {
        carti.add(carte);
        System.out.println("Anulata stergerea cartii: " + carte.getTitlu());
    }
}