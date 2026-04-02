package clase;

public class Client {
    private String Nume;

    public Client(String nume) {
        Nume = nume;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Nume='" + Nume + '\'' +
                '}';
    }
}
