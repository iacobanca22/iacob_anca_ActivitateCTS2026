package clase;

public class EmitereBonSpalare{
     private String Client;

    public EmitereBonSpalare(String client) {
        Client = client;
    }

    public String getClient() {
        return Client;
    }
    public void emitereBon(){
        System.out.println("Emitere Bon pentru:"+Client);
    }
}


