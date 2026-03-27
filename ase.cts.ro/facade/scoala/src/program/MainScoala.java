package program;
import Clase.InscriereElevFacade;
import clase.*;

public class MainScoala {
    public static void main(String[] args) {
        InscriereElevFacade facade = new InscriereElevFacade();

        boolean rezultat = facade.verificaInscriere();

        if (rezultat) {
            System.out.println("INSCRIERE REUSITA");
        } else {
            System.out.println("INSCRIERE RESPINSA");
        }

    }
}