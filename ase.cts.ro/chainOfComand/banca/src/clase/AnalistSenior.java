package clase;

public class AnalistSenior extends Analist {
    @Override
    public void proceseaza(Client client) {
        if (client.getScorCredit()!=null){
            System.out.println("Aprob creditul pentru clientul "+client.getName());
        }
        else {
            super.getUrmatorulAnalist().proceseaza(client);
        }
    }
}
