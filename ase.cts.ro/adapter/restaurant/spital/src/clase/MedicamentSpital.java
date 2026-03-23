package clase;

public class MedicamentSpital {

    private String nume;

    public MedicamentSpital(String nume) {
        this.nume = nume;
    }

    public void prezintaReteta() {
        System.out.println("Se prezinta reteta pentru " + nume);
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + nume + " a fost achizitionat din spital.");
    }

    @Override
    public String toString() {
        return "MedicamentSpital: " + nume;
    }
}
