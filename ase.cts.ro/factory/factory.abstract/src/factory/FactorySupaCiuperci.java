package factory;

import fel.mancare.SupaCiuperci;
import fel.mancare.FelMancare;

public class FactorySupaCiuperci implements FactoryFelMancare{
    public FelMancare creareFelMancare(float pret){
        return new SupaCiuperci(pret);
    }
}
