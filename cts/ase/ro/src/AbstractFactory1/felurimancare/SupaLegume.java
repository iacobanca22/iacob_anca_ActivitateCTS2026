package AbstractFactory1.felurimancare;
import AbstractFactory1.factory.FabricaSupaLegume;

public class SupaLegume extends FelMancare {

    public SupaLegume(float pret) {
        super(pret);
    }

    public String toString() {
        return "SupaLegume pret=" + pret;
    }
}