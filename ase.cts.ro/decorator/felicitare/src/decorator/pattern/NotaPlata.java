package decorator.pattern;
import clase.Nota;

public class NotaPlata implements Nota {
    @Override
    public void printeaza() {
        System.out.println("Nota de plata standard");
    }
}
