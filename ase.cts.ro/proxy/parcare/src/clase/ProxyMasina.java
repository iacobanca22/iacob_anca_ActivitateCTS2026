package clase;
public class ProxyMasina implements Parcare {

    private boolean areAbonament=true;
    private Masina masina;

    public ProxyMasina(Masina masina, boolean areAbonament) {
        this.masina = masina;
        this.areAbonament = areAbonament;
    }

    @Override
    public void intrareParcare() {
        if (areAbonament) {
            masina.intrareParcare();
        } else {
            System.out.println("Nu are abonament. Acces interzis.");
        }
    }
}
