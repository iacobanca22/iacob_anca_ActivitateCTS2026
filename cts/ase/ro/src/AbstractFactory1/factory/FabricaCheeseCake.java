package AbstractFactory1.factory;
import AbstractFactory1.felurimancare.FelMancare;
import AbstractFactory1.felurimancare.CheeseCake;

public class FabricaCheeseCake implements FabricaFelMancare {
    public FelMancare creareFelMancare (float pret){
        return new CheeseCake(pret);
    }

    @Override
    public String toString() {
        return "FabricaCheeseCake {}";
    }
}
