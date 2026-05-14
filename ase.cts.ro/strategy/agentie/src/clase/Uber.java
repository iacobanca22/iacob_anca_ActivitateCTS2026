package clase;

public class Uber implements ModTransport{
    @Override
    public void alegeTransport(String numeClient) {
        System.out.println("clientul merge cu Uber-ul la aeroport"+ numeClient);
    }
}
