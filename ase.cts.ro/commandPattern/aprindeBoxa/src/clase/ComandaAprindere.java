package clase;

public class ComandaAprindere implements Command{
    private Boxa boxa;

    public ComandaAprindere(Boxa boxa) {
        this.boxa = boxa;
    }

    @Override
    public void executa() {
        boxa.aprinde();
    }
}
