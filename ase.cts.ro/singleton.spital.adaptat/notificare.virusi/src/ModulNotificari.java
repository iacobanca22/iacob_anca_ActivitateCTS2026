import java.util.ArrayList;
import java.util.List;

public class ModulNotificari {

    private static ModulNotificari instance;
    private List<String> pacienti;

    private ModulNotificari() {
        pacienti = new ArrayList<>();
    }

    public static ModulNotificari getInstance() {
        if(instance == null) {
            instance = new ModulNotificari();
        }
        return instance;
    }

    public void abonarePacient(String nume) {
        pacienti.add(nume);
    }

    public void trimiteNotificare(String mesaj) {
        for(String pacient : pacienti) {
            System.out.println("Notificare pentru " + pacient + ": " + mesaj);
        }
    }
}
