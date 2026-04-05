package program;
import clase.*;
public class Main {
    static public void main(String[] args) throws Exception{
        Meniu starter=new Categorie("Starter");
        Meniu bauturi= new Categorie("Bauturi");
        Meniu deserturi= new Categorie("Desert");
        Meniu cafea=new Categorie("Cafea");

        Meniu apa=new Produs("Apa");
        Meniu cafeaLapte=new Produs("Cafea Lapte");
        Meniu papanasi=new Produs("Papanasi");
        Meniu cappucino=new Produs("Cappucino");
        Meniu apaMinerala= new Produs("Apa minerala");

        try {
            cafea.adaugaNod(cappucino);
            cafea.adaugaNod(cafeaLapte);

            bauturi.adaugaNod(apa);
            bauturi.adaugaNod(apaMinerala);


            deserturi.adaugaNod(papanasi);

            starter.adaugaNod(deserturi);
            starter.adaugaNod(bauturi);
            starter.adaugaNod(cafea);

            starter.afiseaza();;

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
