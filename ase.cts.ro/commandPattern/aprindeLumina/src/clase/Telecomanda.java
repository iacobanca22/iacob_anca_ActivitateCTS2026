package clase;

public class Telecomanda {

    private IComanda comanda;

    public void setComanda(IComanda comanda) {

        this.comanda = comanda;
    }

    public void apasaButon() {

        comanda.executa();
    }
}
