package AbstractFactory1.factory;
import AbstractFactory1.felurimancare.FelMancare;
import AbstractFactory1.felurimancare.SupaLegume;

public class FabricaSupaLegume implements FabricaFelMancare {

    public FelMancare creareFelMancare(float pret) {
        return new SupaLegume(pret);
    }
}