package clase;

public class Masina {
    private String tip;
    private String nrInmatriculare;

    public Masina(String tip, String nrInmatriculare) {
        this.tip = tip;
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public String getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "tip='" + tip + '\'' +
                ", nrInmatriculare='" + nrInmatriculare + '\'' +
                '}';
    }
}
