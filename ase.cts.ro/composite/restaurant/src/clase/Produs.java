package clase;

public class Produs implements Meniu{
    private String nume;
    public Produs(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("Produs"+nume);
    }

    @Override
    public void getMeniu(int index) throws Exception {
     throw new Exception ("Nu este implementat");
    }

    @Override
    public void stergeNod(Meniu m) throws Exception {
    throw new Exception ("Nu este implementat");
    }

    @Override
    public void adaugaNod(Meniu m) throws Exception {
    throw new Exception("Nu este implementat");
    }
}
