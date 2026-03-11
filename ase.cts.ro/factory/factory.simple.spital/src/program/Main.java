package program;

import factory.FactoryPersonal;
import personal.PersonalSpitalS;
import personal.TipPersonal;

public class Main {

    public static void main(String[] args) {

        PersonalSpitalS p1 =
                FactoryPersonal.crearePersonal(TipPersonal.PMEDIC, "Popescu");

        PersonalSpitalS p2 =
                FactoryPersonal.crearePersonal(TipPersonal.PBRANCARDIER, "Ion");

        System.out.println(p1);
        System.out.println(p2);
    }
}