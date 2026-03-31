package clase;

public class MesajEmail extends AbstractDecoratorNotificare{

    public MesajEmail(INotificare notificare) {
        super(notificare);
    }

    @Override
    public void trimite(String mesaj) {
        super.trimite(mesaj);
        System.out.println("Trimis Email: " + mesaj);
    }
}
