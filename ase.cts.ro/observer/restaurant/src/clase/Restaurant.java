package clase;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class Restaurant implements Subject {

    private List<Observer> observeri;

    private String numeRestutrant;

    public Restaurant(String numeRestutrant) {

        this.numeRestutrant = numeRestutrant;

        observeri = new ArrayList<>();
    }

    @Override
    public void stergeObserver(Observer observer) {

        observeri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {

        for(Observer observer : observeri){

            observer.receptionareMesaj(
                    "Restaurantul " +
                            numeRestutrant +
                            ": " +
                            mesaj
            );
        }
    }

    @Override
    public void adaugaObserver(Observer observer) {

        observeri.add(observer);
    }

    public void notificareMeniu(){

        trimiteNotificare("Avem un meniu nou!");
    }

    public void notificareDesert(){

        trimiteNotificare("Avem desert nou!");
    }
}