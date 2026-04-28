package clase;

public class DetaliiRezervare {
    private String numeClient;
    private String oraRezervarii;

    public DetaliiRezervare(String numeClient, String oraRezervarii) {
        this.numeClient = numeClient;
        this.oraRezervarii = oraRezervarii;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getOraRezervarii() {
        return oraRezervarii;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setOraRezervarii(String oraRezervarii) {
        this.oraRezervarii = oraRezervarii;
    }
}
