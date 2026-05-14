package program;
import composite.*;
import observer.*;

import composite.ComponentaVirus;

public class MainS1 {
    public static void main (String[] args) {

        Continent oms = new Continent("OMS");

        ComponentaVirus europa = new Continent("Europa");
        ComponentaVirus asia = new Continent("Asia");


        ComponentaVirus romania = new Tara("Romania");
        ComponentaVirus elvetia = new Tara("Elvetia");
        ComponentaVirus china = new Tara("China");

        Tulpinavirus delta = new Tulpinavirus("Delta", 152, 8);
        Tulpinavirus covid = new Tulpinavirus("Covid", 12, 3);
        Tulpinavirus omicor = new Tulpinavirus("Omicor", 1520, 11);
        try {
            // bagi tulpinile in tari
            romania.adaugaNod(delta);
            elvetia.adaugaNod(covid);
            china.adaugaNod(omicor);

            // bagi tarile in continente
            europa.adaugaNod(romania);
            europa.adaugaNod(elvetia);
            asia.adaugaNod(china);

            // bagi continentele in radacina
            oms.adaugaNod(europa);
            oms.adaugaNod(asia);

            oms.descriere();
            System.out.println("Total cazuri: " + oms.getTotalCazuri());
        } catch (Exception e) {
            e.printStackTrace();
        }

            Spital spital = new Spital("Spitalul Municipal");

            Vizitator v1 = new Vizitator("Popescu", true);
            Vizitator v2 = new Vizitator("Ionescu", false);
            Vizitator v3 = new Vizitator("Vasilescu", true);
            Vizitator v4 = new Vizitator("Georgescu", true);

        if (v1.isScrisoareAcceptare()) spital.adaugaObserver(v1);
        if (v2.isScrisoareAcceptare()) spital.adaugaObserver(v2);
        if (v3.isScrisoareAcceptare()) spital.adaugaObserver(v3);
        if (v4.isScrisoareAcceptare()) spital.adaugaObserver(v4);


    }
}