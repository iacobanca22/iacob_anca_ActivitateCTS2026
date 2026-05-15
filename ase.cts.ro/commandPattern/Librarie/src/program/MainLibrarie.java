package program;
import clase.*;
public class MainLibrarie {

        public static void main(String[] args) {
            Stoc stoc = new Stoc();
            Angajat angajat = new Angajat();

            Carte ion = new Carte("Ion", 35);
            Carte mara = new Carte("Mara", 25);

            Command adaugaIon = new ComandaAdauga(stoc, ion);
            Command adaugaMara = new ComandaAdauga(stoc, mara);
            Command stergeIon = new ComandaSterge(stoc, ion);

            angajat.invoca(adaugaIon);
            angajat.invoca(adaugaMara);
            angajat.invoca(stergeIon);

            angajat.undo();
        }
    }

