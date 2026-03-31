package clase;

public abstract class AbstractDecoratorNotificare implements INotificare{

    protected INotificare notificare;
    public AbstractDecoratorNotificare(INotificare notificare) {
        this.notificare = notificare;
    }



    @Override
    public void trimite(String mesaj) {
        notificare.trimite(mesaj);
    }
}
