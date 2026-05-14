package observer;
import java.util.ArrayList;
import java.util.List;

public class Spital implements Subject{
    private List <Observer> observeri;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
        observeri=new ArrayList<Observer>();
    }

    private String numeSpital;

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
        if (observeri.size() >= 3) {
            trimiteNotificare("Puteti intra in spital!");
        }
    }

    @Override
    public void stergeObserver(Observer observer) {
        observeri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
       for(Observer observer :observeri) {
           observer.permiteIntrarea("Sunteti echipati cu haine de protectie. Puteti intra in saloane!");
       }
    }


}
