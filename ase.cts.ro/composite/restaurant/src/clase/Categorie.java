package clase;
import java.util.ArrayList;
import java.util.List;

public class Categorie implements Meniu{
    private String nume;
    List<Meniu> lista;
    public Categorie(String nume) {
        lista=new ArrayList<Meniu>();
        this.nume = nume;
    }


    @Override
    public void stergeNod(Meniu m) throws Exception {
    lista.remove(m);
    }

    @Override
    public void getMeniu(int index) throws Exception {
        lista.get(index);
    }

    @Override
    public void adaugaNod(Meniu m) throws Exception {
    lista.add(m);
    }

    @Override
    public void afiseaza() {
        System.out.println("Categorie afiseaza"+nume);
        for(Meniu m:lista){
            m.afiseaza();
        }
    }
}
