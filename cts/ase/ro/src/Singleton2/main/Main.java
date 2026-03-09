package Singleton2.main;

import Singleton2.restaurant.Comanda;
import Singleton2.restaurant.RegistruComenzi;

public class Main {
             public static void main(String[] args) {

            RegistruComenzi r1 = RegistruComenzi.getInstance();
            RegistruComenzi r2 = RegistruComenzi.getInstance();

            r1.addComanda(new Comanda("Pizza", 30));
            r1.addComanda(new Comanda("Paste", 25));

            r2.afiseazaComanda();

            System.out.println("Este aceeași instanță? " + (r1 == r2));
        }
    }
