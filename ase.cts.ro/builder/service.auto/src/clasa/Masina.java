package clasa;

public class Masina {
    private String numeClient;

    private String tipMasina;

    private boolean schimbUlei;

    private boolean spalareMasina;

    public void setSchimbUlei(boolean schimbUlei) {
        this.schimbUlei = schimbUlei;
    }

    public void setSpalareMasina(boolean spalareMasina) {
        this.spalareMasina = spalareMasina;
    }

    public void setTipMasina(String tipMasina) {
        this.tipMasina = tipMasina;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }



    @Override
    public String toString() {
        return "Masina{" +
                "numeClient='" + numeClient + '\'' +
                ", tipMasina='" + tipMasina + '\'' +
                ", schimbUlei=" + schimbUlei +
                ", spalareMasina=" + spalareMasina +
                '}';
    }
}
