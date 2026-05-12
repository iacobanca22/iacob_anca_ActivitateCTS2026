package clase;

import observer.Observer;

public interface Subject {

    void stergeObserver(Observer observer);

    void adaugaObserver(Observer observer);

    void trimiteNotificare(String mesaj);
}