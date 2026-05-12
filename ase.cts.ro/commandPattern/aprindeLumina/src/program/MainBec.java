package program;
import clase.*;

public class MainBec {
    public static void main(String[] args) {

        Bec bec = new BecConcret();

        IComanda aprindere =
                new ComandaAprindere(bec);

        IComanda stingere =
                new ComandaStingere(bec);

        Telecomanda telecomanda =
                new Telecomanda();

        telecomanda.setComanda(aprindere);
        telecomanda.apasaButon();

        telecomanda.setComanda(stingere);
        telecomanda.apasaButon();
    }
}
