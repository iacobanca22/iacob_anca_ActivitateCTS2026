package program;
import clase.*;

public class MainAplicatieMuzicala {
    public static void main(String[] args){
        Melodie melodie=new Melodie("Mama", "Cargo","3:48");
        InterfataMuzicala piesa= new PiesaMuzicala("Pe motoare", 3.56f);

        melodie.play();
        System.out.println(melodie.getInfo());


        InterfataMuzicala adapter=new MelodieAdapter(melodie);
        adapter.reda();
        adapter.descrie();
    }
}
