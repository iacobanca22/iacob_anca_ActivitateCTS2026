package program;
import clase.FabricaLocuri;
import clase.LocCinema;
import clase.DetaliiRezervare;

public class MainCinema {
    public static void main(String[] args) {


        FabricaLocuri fabrica = new FabricaLocuri();


        DetaliiRezervare rezervare1 = new DetaliiRezervare("Ana", "18:00");
        DetaliiRezervare rezervare2 = new DetaliiRezervare("Ion", "19:00");
        DetaliiRezervare rezervare3 = new DetaliiRezervare("Maria", "20:00");
        DetaliiRezervare rezervare4 = new DetaliiRezervare("Paul", "21:00");


        LocCinema loc1 = fabrica.getLoc(5, "VIP");
        loc1.detaliiRezervare(rezervare1);

        fabrica.getLoc(5, "VIP").detaliiRezervare(rezervare2);

        fabrica.getLoc(3, "Standard").detaliiRezervare(rezervare3);

        fabrica.getLoc(5, "VIP").detaliiRezervare(rezervare4);

        System.out.println("Numar locuri create: " + fabrica.getNumarLocuri());
    }
}
