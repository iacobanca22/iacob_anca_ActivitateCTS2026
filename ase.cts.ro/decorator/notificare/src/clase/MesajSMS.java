package clase;

public class MesajSMS extends AbstractDecoratorNotificare{
    public MesajSMS(INotificare notificare) {
        super(notificare);
    }

    @Override
    public void trimite(String mesaj) {
        super.trimite(mesaj);
        System.out.println("Mesaj trimis"+mesaj);
    }
}
