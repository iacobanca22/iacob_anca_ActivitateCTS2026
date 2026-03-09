package AbstractFactory1.factory;

import AbstractFactory1.felurimancare.FelMancare;
import AbstractFactory1.felurimancare.SupaVita;

public class FabricaSupaVita implements FabricaFelMancare{
    @Override
    public FelMancare creareFelMancare(float pret) {
        return new SupaVita(pret);
    }

}
