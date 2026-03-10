package fel.mancare;

import fel.mancare.FelMancare;

public class SupaVita extends FelMancare{
    public SupaVita(float pret){
        super(pret);
    }


    public String toString() {
        return "SupaVita pret=" + pret;
    }
}
