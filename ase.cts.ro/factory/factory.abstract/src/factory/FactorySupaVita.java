package factory;

import fel.mancare.FelMancare;
import fel.mancare.SupaVita;

public class FactorySupaVita implements FactoryFelMancare{
    public FelMancare creareFelMancare(float pret){
        return new SupaVita(pret);
    }
}
