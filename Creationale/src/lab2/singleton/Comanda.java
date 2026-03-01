package lab2.singleton;

public class Comanda {
private String denumire;
private double pret;

    public Comanda(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}
