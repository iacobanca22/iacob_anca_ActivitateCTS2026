package singleton.main;

import singleton.spital.Pacient;
import singleton.spital.RegistruInternari;


public class Main {
    public static void main(String[] args) {

        RegistruInternari registru1 = RegistruInternari.getInstance();
        RegistruInternari registru2 = RegistruInternari.getInstance();

        registru1.adaugaPacient(new Pacient("Ana"));
        registru1.adaugaPacient(new Pacient("Ion"));
        registru1.adaugaPacient(new Pacient("Maria"));
        registru2.afiseazaPacienti();

        System.out.println("Este aceeași instanță? " + (registru1 == registru2));
    }
}