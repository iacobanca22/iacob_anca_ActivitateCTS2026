package clase;

public class MesajWhatsUp extends AbstractDecoratorNotificare{
    public MesajWhatsUp(INotificare notificare) {
        super(notificare);
    }

    @Override
    public void trimite(String mesaj) {
        super.trimite(mesaj);
        System.out.println("Mesaj trimis"+mesaj);
    }
}
