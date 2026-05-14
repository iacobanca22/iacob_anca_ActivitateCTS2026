package clase;

public class Autobuz implements ModTransport{

    @Override
    public void alegeTransport(String numeClient) {
        System.out.println("clientul merge cu autobuzul-ul la aeroport"+ numeClient);
    }
}
