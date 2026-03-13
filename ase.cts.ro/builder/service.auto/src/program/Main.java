package program;

import builder.BuilderMasina;
import builder.BuilderService;
import clasa.Masina;

public class Main {
    public static void main(String[] args){
        BuilderService builder= new BuilderMasina();
        builder.numeClient();
        builder.getMasina();
        builder.schimbUlei();
        builder.spalaMasina();

         Masina masina =builder.getMasina();

         System.out.println(masina);


    }
}
