package AbstractFactory1.felurimancare;
import AbstractFactory1.factory.FabricaPapanasi;

public class Papanasi extends FelMancare {

    public Papanasi(float pret) {
        super(pret);
    }

    public String toString() {
        return "Papanasi pret=" + pret;
    }
}