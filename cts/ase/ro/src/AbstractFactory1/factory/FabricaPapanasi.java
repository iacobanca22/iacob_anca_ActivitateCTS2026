package AbstractFactory1.factory;
import AbstractFactory1.felurimancare.FelMancare;
import AbstractFactory1.felurimancare.Papanasi;
public class FabricaPapanasi implements FabricaFelMancare {

    public FelMancare creareFelMancare(float pret) {
        return new Papanasi(pret);
    }

    @Override
    public String toString() {
        return "FabricaPapanasi{}";
    }
}
