package program;
import clase.*;

public class MainTransport {
    public static void main(String[]args){
      Client client=new Client("Popescu");
      ModTransport mod1= new Taxi();
      ModTransport mod2= new Uber();

      client.setModTransport(mod1);
      client.mergeLaAeroport();

      client.setModTransport(mod2);
      client.mergeLaAeroport();
    }
}
