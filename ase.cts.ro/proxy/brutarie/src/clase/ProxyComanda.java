package clase;

public class ProxyComanda implements Comanda{
    private ComandaBrutarie comanda;

    public ProxyComanda() {
        this.comanda = new ComandaBrutarie();
    }

    @Override
    public void descriere() {
        comanda.descriere();
    }

    @Override
    public void plaseazaComanda(double suma) {
        if (suma >= 50) {
            comanda.plaseazaComanda(suma);
        } else {
            System.out.println("Comanda nu poate fi plasata. Suma minima este 50 lei.");
        }
    }
}

