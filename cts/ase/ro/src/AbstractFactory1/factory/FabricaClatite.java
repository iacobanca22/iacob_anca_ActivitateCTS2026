package AbstractFactory1.factory;

import AbstractFactory1.felurimancare.FelMancare;
import AbstractFactory1.felurimancare.Clatite;

public class FabricaClatite implements FabricaFelMancare {

public FelMancare creareFelMancare(float pret) {
    return new Clatite(pret);
}

@Override
public String toString() {
    return "FabricaClatite{}";
}

}
