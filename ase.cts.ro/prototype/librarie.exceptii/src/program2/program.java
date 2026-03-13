package program2;

import prototipEx.CarteEx;
import prototipEx.Prototip;

public class program {

    public static void main(String[] args) {

        Prototip carte = new CarteEx("","I.Teodoreanu","RAO",250);
        Prototip carte2 = null;

        try {
            carte2 = carte.copiaza();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        ((CarteEx) carte2).setAutor("B.Alecu");

        System.out.println(carte.toString());
        System.out.println(carte2.toString());
    }
}
