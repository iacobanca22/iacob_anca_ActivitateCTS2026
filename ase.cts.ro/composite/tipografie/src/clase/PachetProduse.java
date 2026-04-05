package clase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class PachetProduse implements ProduseTipografie {
    private String nume;
    private List<ProduseTipografie> lista= new ArrayList<>();

    public PachetProduse(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaProdus(ProduseTipografie produs) throws Exception {
        lista.add(produs);
    }

    @Override
    public void stergereProdus(ProduseTipografie produs) throws Exception {
         lista.remove(produs);
    }

    @Override
    public ProduseTipografie getProduseTipografie(int id) throws Exception {
        return lista.get(id);
    }

    @Override
    public void afisare() {
        System.out.println("produs"+nume);
        for(ProduseTipografie p:lista){
          p.afisare();
        }

    }
}
