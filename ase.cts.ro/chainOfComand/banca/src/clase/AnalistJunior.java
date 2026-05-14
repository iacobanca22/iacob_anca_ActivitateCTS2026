package clase;

public class AnalistJunior extends Analist {
    @Override
    public void proceseaza(Client client) {
        if(client.getVenit()>3000){
            System.out.println("Aprobam creditul pentru clientul "+client.getName() +" valoare credit ");

        }
        else {
            super.getUrmatorulAnalist().proceseaza(client);
        }
    }
}
