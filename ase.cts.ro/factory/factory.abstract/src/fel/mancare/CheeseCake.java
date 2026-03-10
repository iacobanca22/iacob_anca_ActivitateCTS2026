package fel.mancare;

import fel.mancare.FelMancare;

public class CheeseCake extends FelMancare{
    public CheeseCake(float pret) {
        super(pret);
    }


    public String toString() {
        return "CheeseCake pret=" + pret;
    }
}
