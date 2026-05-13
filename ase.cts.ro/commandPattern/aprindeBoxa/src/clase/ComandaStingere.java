package clase;

public class ComandaStingere implements Command{
    private Boxa boxa;

    public ComandaStingere(Boxa boxa) {
        this.boxa = boxa;
    }

    @Override
    public void executa() {
        boxa.stinge();
    }
}
