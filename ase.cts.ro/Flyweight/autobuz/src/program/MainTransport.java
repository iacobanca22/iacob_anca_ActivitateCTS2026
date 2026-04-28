package program;
import clase.FabricaAutobuze;
import clase.Transport;
import clase.DetaliiCursa;

public class MainTransport {
            public static void main(String[] args) {


            FabricaAutobuze fabrica = new FabricaAutobuze();


            DetaliiCursa cursa1 = new DetaliiCursa("08:00", 30);
            DetaliiCursa cursa2 = new DetaliiCursa("09:00", 45);
            DetaliiCursa cursa3 = new DetaliiCursa("10:00", 20);
            DetaliiCursa cursa4 = new DetaliiCursa("11:00", 50);


            Transport autobuz1 = fabrica.getAutobuz(10);
            autobuz1.detaliiCursa(cursa1);

            System.out.println("\n");


            fabrica.getAutobuz(10).detaliiCursa(cursa2);

            System.out.println("\n");


            fabrica.getAutobuz(20).detaliiCursa(cursa3);

            System.out.println("\n");

            fabrica.getAutobuz(10).detaliiCursa(cursa4);

            System.out.println("\n");


            System.out.println("Numar autobuze create: " + fabrica.getNumarAutobuze());
        }
    }

