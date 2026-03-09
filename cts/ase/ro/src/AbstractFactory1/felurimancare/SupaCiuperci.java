package AbstractFactory1.felurimancare;
import AbstractFactory1.factory.FabricaSupaCiuperci;

public class SupaCiuperci extends FelMancare {

    public SupaCiuperci(float pret) {
        super(pret);
    }

    public String toString() {
        return "SupaCiuperci pret=" + pret;
    }
}