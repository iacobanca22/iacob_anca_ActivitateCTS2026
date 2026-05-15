package clase;

public class ComandaDepunere implements Command{
    private ContBancar cont;
    private double suma;

    public ComandaDepunere(ContBancar cont, double suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void executa() {
        cont.depune(suma);
    }
}
