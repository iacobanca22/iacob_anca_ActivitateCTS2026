package decorator.pattern;
import clase.Nota;


public class NotaCuFelicitare extends NotaPlata {

    public NotaCuFelicitare(Nota nota) {
        super();
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("La multi ani!");
    }
}