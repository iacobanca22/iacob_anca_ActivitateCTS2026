package lab2.singleton;
import java.util.ArrayList;
import java.util.List;
public class RegistruComenzi {
    private static RegistruComenzi instanta;
    private List<Comanda> comenzi;
    private RegistruComenzi() {
        comenzi = new ArrayList<>();

    }
    public static RegistruComenzi getInstance(){
        if(instanta==null){
            instanta=new RegistruComenzi();
        }
        return instanta;
    }
    public void addComanda(Comanda comanda){
        comenzi.add(comanda);
    }
       public void afiseazaComanda() {
        System.out.println("Lista comenzi:");
        for (Comanda c : comenzi) {
            System.out.println(c);
        }
    }
}
