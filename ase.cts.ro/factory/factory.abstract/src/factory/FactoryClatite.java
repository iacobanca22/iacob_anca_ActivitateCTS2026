package factory;

import fel.mancare.FelMancare;
import fel.mancare.Clatite;

public class FactoryClatite implements FactoryFelMancare{
    public FelMancare creareFelMancare(float pret){
        return new Clatite(pret);
    }
}
