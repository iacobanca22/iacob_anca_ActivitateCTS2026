package clase;

public class ComandaRetragere implements Command{
    private ContBancar cont;
    private double suma;

    public ComandaRetragere(ContBancar cont, double suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void executa() {
        cont.retrage(suma);
    }
}
