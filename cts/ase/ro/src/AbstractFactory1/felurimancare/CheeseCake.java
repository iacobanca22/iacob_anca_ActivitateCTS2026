package AbstractFactory1.felurimancare;

public class CheeseCake extends FelMancare{
    public CheeseCake(float pret) {
        super(pret);
    }
    public String toString() {
        return "CheeseCake pret=" + pret;
    }
}
