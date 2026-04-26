package program;
import clase.*;

public class MainFarmacie {
    public static void main(String[] args) {
    // fara proxy
    MedicamentReal m = new MedicamentReal();
        m.cumpara();

    // cu proxy
    Medicament m1 = new ProxyMedicament(false);
        m1.cumpara();

    Medicament m2 = new ProxyMedicament(true);
        m2.cumpara();
}
}

