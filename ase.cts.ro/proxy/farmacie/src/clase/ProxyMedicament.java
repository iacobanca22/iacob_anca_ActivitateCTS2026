package clase;

public class ProxyMedicament implements Medicament{
    private MedicamentReal medicament;
    private boolean areReteta;

    public ProxyMedicament(boolean areReteta) {
        this.areReteta = areReteta;
    }

    @Override
    public void cumpara() {

        if (areReteta) {
            medicament.cumpara();
        } else {
            System.out.println("Nu se poate cumpara fara reteta");
        }
    }
}
