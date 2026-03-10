package platacentralizata.program;
import platacentralizata.plata.SistemPlata;

public class Program {

    public static void main(String[] args) {

        SistemPlata sistem = SistemPlata.getInstance();

        sistem.proceseazaPlata("card", 50);
    }
}