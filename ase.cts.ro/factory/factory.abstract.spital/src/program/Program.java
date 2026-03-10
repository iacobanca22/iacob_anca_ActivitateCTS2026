package program;
import Factory.*;
import Personal.*;

public class Program {

    public static void main(String[] args) {

        FactoryPersonal factory = new FactorySpital();

        PersonalMedical p1 = factory.crearePersonalMedical("Dr Popescu");
        PersonalNonMedical p2 = factory.crearePersonalNonMedical("Ana");

        System.out.println(p1);
        System.out.println(p2);
    }
}