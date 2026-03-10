package factory;

import fel.mancare.FelMancare;
import fel.mancare.Papanasi;

public class FactoryPapanasi implements FactoryFelMancare{

    public FelMancare creareFelMancare(float pret) {
        return new Papanasi(pret);
    }
}
