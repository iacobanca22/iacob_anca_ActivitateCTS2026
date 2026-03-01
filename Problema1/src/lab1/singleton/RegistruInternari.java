package lab1.singleton;

import java.util.ArrayList;
import java.util.List;

public class RegistruInternari {

    private static RegistruInternari instanta;

    private List<Pacient> pacienti;

    private RegistruInternari() {
        pacienti = new ArrayList<>();
    }

    public static RegistruInternari getInstance() {
        if (instanta == null) {
            instanta = new RegistruInternari();
        }
        return instanta;
    }

        public void adaugaPacient(Pacient pacient) {
        pacienti.add(pacient);
    }


    public void afiseazaPacienti() {
        System.out.println("Lista pacienților internați:");
        for (Pacient p : pacienti) {
            System.out.println(p);
        }
    }
}

