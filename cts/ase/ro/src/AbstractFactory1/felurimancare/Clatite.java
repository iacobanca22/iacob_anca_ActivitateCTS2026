package AbstractFactory1.felurimancare;

import AbstractFactory1.factory.FabricaClatite;

public class Clatite extends FelMancare {

    public Clatite(float pret) {
        super(pret);
    }

    public String toString() {
        return "Clatite pret=" + pret;
    }
}