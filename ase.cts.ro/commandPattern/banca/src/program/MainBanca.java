package program;
import clase.*;

import clase.ContBancar;

public class MainBanca {
    public static void main(String[] args){
        ContBancar cont=new ContBancar(4300,"RO123456789");
        Casier casier= new Casier();

        Command depunere= new ComandaDepunere(cont,500);
        System.out.println("Valoare cont este de "+ cont.getSold());
        casier.invoca(depunere);
        System.out.println("Valoare cont este de "+ cont.getSold());

        Command retragere= new ComandaRetragere(cont,200);
        casier.invoca(retragere);
        System.out.println("Valoare cont este de "+ cont.getSold());
    }
}
