package factory;

import fel.mancare.FelMancare;
import fel.mancare.CheeseCake;

public class FactoryCheeseCake implements FactoryFelMancare{
    public FelMancare creareFelMancare (float pret){
        return new CheeseCake(pret);
    }
}
