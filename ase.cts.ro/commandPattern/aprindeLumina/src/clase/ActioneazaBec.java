package clase;

public class ActioneazaBec implements IComanda {

    private Bec bec;

    public ActioneazaBec(Bec bec) {
        this.bec = bec;
    }

    @Override
    public void executa() {

        bec.aprinde();
    }
}