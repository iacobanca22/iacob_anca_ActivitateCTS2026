package clase;

public class Taxi implements ModTransport
{
    @Override
    public void alegeTransport(String numeClient) {
        System.out.println("clientul merge cu Taxi-ul la aeroport"+ numeClient);
    }
}
