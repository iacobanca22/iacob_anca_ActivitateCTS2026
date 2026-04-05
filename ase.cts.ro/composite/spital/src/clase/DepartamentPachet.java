package clase;
import java.util.List;
import java.util.ArrayList;

public class DepartamentPachet implements DepartamenteSpital{
    private String nume;
    List<DepartamenteSpital> lista;

    public DepartamentPachet(String nume) {
        lista= new ArrayList<DepartamenteSpital>();
        this.nume = nume;
    }

    @Override
    public DepartamenteSpital getDepartamentspital(int index) throws Exception {
        return lista.get(index);
    }

    @Override
    public void stergereNod(DepartamenteSpital dep) throws Exception {
    lista.remove(dep);
    }

    @Override
    public void adaugaNod(DepartamenteSpital dep) throws Exception {
    lista.add(dep);
    }
    @Override
    public void afiseaza() throws Exception {
        System.out.println("Departamen "+ nume);
        for(DepartamenteSpital dep:lista){
            dep.afiseaza();
        }

    }
}
