package AbstractFactory1.program;
import AbstractFactory1.factory.*;
import AbstractFactory1.felurimancare.FelMancare;

    public class Program {

        public static void  main(String[] args) {

            FabricaFelMancare fabrica1 = new FabricaSupaLegume();
            FelMancare supa1 = fabrica1.creareFelMancare(15);

            FabricaFelMancare fabrica3 = new FabricaSupaCiuperci();
            FelMancare supa2 = fabrica3.creareFelMancare(45);

            FabricaFelMancare fabrica4 = new FabricaSupaVita();
            FelMancare supa3 = fabrica4.creareFelMancare(69);

            FabricaFelMancare fabrica2 = new FabricaPapanasi();
            FelMancare desert = fabrica2.creareFelMancare(35.5f);

            FabricaFelMancare fabrica5 = new FabricaClatite();
            FelMancare desert2 = fabrica5.creareFelMancare(65.5f);



            System.out.println(desert);
            System.out.println(supa1);
            System.out.println(supa2);
            System.out.println(supa3);
            System.out.println(desert2);
            ;

        }
    }

