package composite;

public class Tulpinavirus implements ComponentaVirus {
 private String nume;
 private int perioadaDeIncubatie;
 private int nrCazuri;

    public Tulpinavirus(String nume, int nrCazuri, int perioadaDeIncubatie) {
        this.nume = nume;
        this.nrCazuri = nrCazuri;
        this.perioadaDeIncubatie = perioadaDeIncubatie;
    }

    @Override
    public void adaugaNod(ComponentaVirus componenta) throws Exception {
        throw new Exception("Operatie nepermisa pe nod frunza");
    }

    @Override
    public void stergeNod(ComponentaVirus componenta) throws Exception {
        throw new Exception("Operatie nepermisa pe nod frunza");
    }

    @Override
    public ComponentaVirus getNod(int index) throws Exception {
        throw new Exception("Operatie nepermisa pe nod frunza");
    }

    @Override
    public void descriere() {
        System.out.println("Tulpina: " + nume +
                " | Incubatie: " + perioadaDeIncubatie + " zile" +
                " | Cazuri: " + nrCazuri);
    }

    @Override
    public int getTotalCazuri() {
        return nrCazuri;
    }


}
