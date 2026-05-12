package clase;

public class ComandaAprindere implements IComanda {

    private Bec bec;

    public ComandaAprindere(Bec bec) {

        this.bec = bec;
    }

    @Override
    public void executa() {

        bec.aprinde();
    }
}
