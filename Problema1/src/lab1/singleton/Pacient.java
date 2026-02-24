package lab1.singleton;

public class Pacient {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
