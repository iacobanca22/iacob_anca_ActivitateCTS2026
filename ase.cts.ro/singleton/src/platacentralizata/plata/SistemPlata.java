package platacentralizata.plata;

public class SistemPlata {

    private static SistemPlata instanta = null;

    private SistemPlata() {
    }

    public static SistemPlata getInstance() {

        if(instanta == null) {
            instanta = new SistemPlata();
        }

        return instanta;
    }

    public void proceseazaPlata(String metoda, float suma) {
        System.out.println("Plata de " + suma + " lei realizata prin " + metoda);
    }
}