package clase;

public class Director extends Analist {

    @Override
    public void proceseaza(Client client) {
        System.out.println("Se respinge creditul pentru clientu "+client.getName());
    }
}
