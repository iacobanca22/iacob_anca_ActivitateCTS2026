package clase;
import java.util.ArrayList;
import java.util.List;
import patternObserver.Observer;


public class Editura implements Subject{
    private List<Observer> observeri;
    private String numeAgentie;

    public Editura(String numeAgentie) {
        this.numeAgentie = numeAgentie;
        observeri=new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
       observeri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer:observeri){
            observer.receptionareMesaj(
                    numeAgentie + ": " + mesaj);
        }

    }
    public void notificareRevistaNoua(){

        trimiteNotificare(
                "A aparut noul numar al revistei!"
        );
    }
    public void notificareReducere(){

        trimiteNotificare(
                "Reducere de 20% la abonamente!"
        );
    }

}
