package clase;

public class MelodieAdapter implements InterfataMuzicala{
    private Melodie melodie;

    public MelodieAdapter(Melodie melodie) {
        this.melodie = melodie;
    }

    @Override
    public void reda() {
     melodie.play();
    }

    @Override
    public void descrie() {
     System.out.println(melodie.getInfo());
    }
}
