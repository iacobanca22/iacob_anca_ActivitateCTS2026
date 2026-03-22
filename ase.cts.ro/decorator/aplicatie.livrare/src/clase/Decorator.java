package clase;

public abstract class Decorator implements GenereazaBon{
 protected GenereazaBon print;

    public Decorator(GenereazaBon print) {
        this.print = print;
    }

    @Override
    public void genereazaBon() {
        print.genereazaBon();
    }
}
