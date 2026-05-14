package program;
import clase.*;

public class Main {
    public static void main (String[] args)
    {
        Analist analistjunior=new AnalistJunior();
        Analist analiistSenior= new AnalistSenior();
        Analist director=new Director();

        analistjunior.setUrmatorulAnalist(analiistSenior);
        analiistSenior.setUrmatorulAnalist(director);

        Client client1= new Client("popescu", 2000, null);
        Client client2= new Client("ionescu", 4500, null);
        Client client3= new Client("iliescu", 2500, 5);
        analistjunior.proceseaza(client1);
        analistjunior.proceseaza(client2);
        analistjunior.proceseaza(client3);
    }
}
