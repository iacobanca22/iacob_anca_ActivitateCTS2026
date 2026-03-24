package program;
import clase.*;

public class MainCarte {
    public static void proceseazaCarte(CarteOnline carte) {
        carte.descarcaCarte();
    }
    public static void main(String[] args){
        CarteOnline online = new CarteOnlineImpl();
        proceseazaCarte(online);

        System.out.println("\nSe doreste utilizarea sistemului bibliotecii:");


        CarteBiblioteca carte = new CarteBiblioteca("Ion");
        carte.imprumutCarte();

        System.out.println("\nSe foloseste Adapter:");


        CarteOnline adapter = new AdapterCarte("Morometii");
        proceseazaCarte(adapter);

    }

    }

