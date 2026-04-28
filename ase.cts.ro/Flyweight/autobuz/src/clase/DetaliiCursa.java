package clase;

public class DetaliiCursa {
    private String  oraPlecare;
    private int nrPasageri;

    public DetaliiCursa(String oraPlecare, int nrPasageri) {
        this.oraPlecare = oraPlecare;
        this.nrPasageri = nrPasageri;
    }

    public String getOraPlecare() {
        return oraPlecare;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    public void setOraPlecare(String oraPlecare) {
        this.oraPlecare = oraPlecare;
    }

    public void setNrPasageri(int nrPasageri) {
        this.nrPasageri = nrPasageri;
    }
}
