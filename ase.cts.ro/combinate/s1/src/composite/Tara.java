package composite;
import java.util.ArrayList;
import java.util.List;


public class Tara implements ComponentaVirus{
    List<ComponentaVirus> lista;
    private String name;

    public Tara(String name) {
        lista= new ArrayList<ComponentaVirus>();
        this.name = name;
    }

    @Override
    public void adaugaNod(ComponentaVirus componenta) throws Exception {
        lista.add(componenta);
    }

    @Override
    public void stergeNod(ComponentaVirus componenta) throws Exception {
       lista.remove(componenta);
    }

    @Override
    public ComponentaVirus getNod(int index) throws Exception {
       return lista.get(index);
    }

    @Override
    public void descriere() {
            System.out.println("Tara: " + name);
            for (ComponentaVirus componenta : lista) {
                componenta.descriere();
            }
        }


    @Override
    public int getTotalCazuri() {
        int total = 0;
        for (ComponentaVirus componenta : lista) {
            total += componenta.getTotalCazuri();
        }
        return total;
    }

}
