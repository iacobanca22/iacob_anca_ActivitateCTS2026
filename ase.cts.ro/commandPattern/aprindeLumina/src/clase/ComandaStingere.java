package clase;

public class ComandaStingere implements IComanda {

    private Bec bec;

    public ComandaStingere(Bec bec) {

        this.bec = bec;
    }

    @Override
    public void executa() {

        bec.stinge();
    }
}