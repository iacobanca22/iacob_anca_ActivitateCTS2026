package clase;

public class Masina implements Parcare {
    private String nrInmatriculare;
    private String tipMasina;

    public Masina(String nrInmatriculare, String tipMasina) {
        this.nrInmatriculare = nrInmatriculare;
        this.tipMasina = tipMasina;
    }

    @Override
    public void intrareParcare() {
    System.out.println("masina"+ tipMasina+" a parcat:"+nrInmatriculare);

    }

}
