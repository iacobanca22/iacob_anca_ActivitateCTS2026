package clase;

public class Client {
    private String numeClient;
    private ModTransport modTransport;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }



    public void setModTransport(ModTransport modTransport) {
        this.modTransport = modTransport;
    }
   public void mergeLaAeroport(){
        modTransport.alegeTransport(numeClient);
   }

}
