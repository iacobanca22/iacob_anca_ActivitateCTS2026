package Clase;

public class Elev {
    private String nume;

    public Elev(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
