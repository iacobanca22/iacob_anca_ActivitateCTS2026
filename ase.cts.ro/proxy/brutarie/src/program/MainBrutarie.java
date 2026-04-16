package program;
import clase.*;

public class MainBrutarie {
    public static void main (String [] args){

                ComandaBrutarie comanda1 = new ComandaBrutarie();
                comanda1.plaseazaComanda(30);


                Comanda proxy = new ProxyComanda();
                proxy.plaseazaComanda(30);
                proxy.plaseazaComanda(70);
            }
}


