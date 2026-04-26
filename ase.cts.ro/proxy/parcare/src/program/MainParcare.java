package program;

import clase.Masina;
import clase.Parcare;
import clase.ProxyMasina;


public class MainParcare {
        public static void main(String[] args) {

                       Masina masina1 = new Masina("B123ABC", "SUV");

            // far proxy
            masina1.intrareParcare();

            System.out.println("------------------");

            // proxy - fara abonament
            Parcare proxy1 = new ProxyMasina(masina1, false);
            proxy1.intrareParcare();

            System.out.println("------------------");

            // proxy - cu abonament
            Parcare proxy2 = new ProxyMasina(masina1, true);
            proxy2.intrareParcare();
        }
    }

