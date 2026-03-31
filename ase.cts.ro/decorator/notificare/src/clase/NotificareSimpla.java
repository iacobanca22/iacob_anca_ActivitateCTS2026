package clase;

public class NotificareSimpla implements INotificare {

    @Override
    public void trimite(String mesaj) {
        System.out.println(mesaj);
    }
}
