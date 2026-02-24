package lab1.singleton;

import java.util.ArrayList;
import java.util.List;

public class RegistruInternari {

    // instanța unică
    private static RegistruInternari instanta;

    // lista pacienți
    private List<Pacient> pacienti;

    // constructor privat
    private RegistruInternari() {
        pacienti = new ArrayList<>();
    }

    // metodă acces global
    public static RegistruInternari getInstance() {
        if (instanta == null) {
            instanta = new RegistruInternari();
        }
        return instanta;
    }

    // adăugare pacient
    public void adaugaPacient(Pacient pacient) {
        pacienti.add(pacient);
    }

    // afișare pacienți
    public void afiseazaPacienti() {
        System.out.println("Lista pacienților internați:");
        for (Pacient p : pacienti) {
            System.out.println(p);
        }
    }
}

