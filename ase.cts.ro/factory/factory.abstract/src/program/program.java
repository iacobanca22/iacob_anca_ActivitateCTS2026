package program;
import factory.*;
import fel.mancare.*;



public class program {
            public static void main(String[] args) {

            FactoryFelMancare fabrica1 = new FactorySupaLegume();
            FelMancare fel1 = fabrica1.creareFelMancare(15);

            FactoryFelMancare fabrica2 = new FactorySupaVita();
            FelMancare fel2 = fabrica2.creareFelMancare(35);

            FactoryFelMancare fabrica3 =new FactorySupaCiuperci();
            FelMancare fel3= fabrica3.creareFelMancare(55);

            FactoryFelMancare fabrica4= new FactoryClatite();
            FelMancare fel4 = fabrica4.creareFelMancare(75);

            FactoryFelMancare fabrica5= new FactoryCheeseCake();
            FelMancare fel5=fabrica5.creareFelMancare(105.5f);

            FactoryFelMancare fabrica6=new FactoryPapanasi();
            FelMancare fel6=fabrica6.creareFelMancare(25.3f);

            System.out.println(fel1);
            System.out.println(fel2);
            System.out.println(fel3);
            System.out.println(fel4);
            System.out.println(fel5);
            System.out.println(fel6);

            }
    }

