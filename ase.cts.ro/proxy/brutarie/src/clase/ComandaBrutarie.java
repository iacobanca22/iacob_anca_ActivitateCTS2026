package clase;

public class ComandaBrutarie implements Comanda{
    @Override
    public void descriere() {

            System.out.println("Comanda de produse de panificatie");


    }

    @Override
    public void plaseazaComanda(double suma) {
        System.out.println("Comanda a fost plasata pentru suma de " + suma + " lei");

    }
}
