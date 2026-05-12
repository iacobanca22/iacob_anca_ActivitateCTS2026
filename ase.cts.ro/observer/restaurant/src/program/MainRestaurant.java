package program;

import clase.Restaurant;
import clase.Subject;
import observer.ClientFidel;
import observer.Observer;

public class MainRestaurant {
    public static void main (String[] args){

        ClientFidel client1 =
                new ClientFidel("Gige");

        ClientFidel client2 =
                new ClientFidel("Maria");

        Restaurant restaurant =
                new Restaurant("Hanul Ancutei");


        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);


        restaurant.notificareMeniu();

        restaurant.notificareDesert();

    }
}
