package factory;
import fel.mancare.FelMancare;
import fel.mancare.SupaLegume;

public class FactorySupaLegume implements FactoryFelMancare{
    public FelMancare creareFelMancare(float pret) {
        return new SupaLegume(pret);
    }
}
