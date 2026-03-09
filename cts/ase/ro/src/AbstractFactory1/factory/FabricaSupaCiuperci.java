package AbstractFactory1.factory;
import AbstractFactory1.felurimancare.FelMancare;
import AbstractFactory1.felurimancare.SupaCiuperci;

public class FabricaSupaCiuperci implements FabricaFelMancare {

    public FelMancare creareFelMancare(float pret) {
        return new SupaCiuperci(pret);
    }
}