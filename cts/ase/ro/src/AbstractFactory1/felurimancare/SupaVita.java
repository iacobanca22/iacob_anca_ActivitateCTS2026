package AbstractFactory1.felurimancare;
import AbstractFactory1.factory.FabricaSupaVita;


public class SupaVita extends FelMancare{

    public SupaVita(float pret) {
        super(pret);
    }

    public String toString() {
        return "SupaVita pret=" + pret;
    }
}

