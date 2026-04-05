package clase;

public class ProdusSimplu implements ProduseTipografie {
    private String nume;

    public ProdusSimplu(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaProdus(ProduseTipografie produs) throws Exception {
    throw new Exception("Produsul nu este implementat");
    }

    @Override
    public void stergereProdus(ProduseTipografie produs) throws Exception {
    throw new Exception("Produsul nu este implementat");
    }

    @Override
    public ProduseTipografie getProduseTipografie(int id) throws Exception {
        throw new Exception("Produsul nu este implementat");
    }

    @Override
    public void afisare() {
    System.out.println("produs"+nume);
    }
}
