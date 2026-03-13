package Program;
import prototip.Carte;
import prototip.Prototip;

public class Program {
    public static void main(String[] args){
        Prototip carte= new Carte("La medeleni","I.Teodoreanu","RAO",250 );
        Prototip carte2=carte.copiaza();
        ((Carte)carte2).setAutor("B.Alecu");
        System.out.println(carte.toString());
        System.out.println(carte2.toString());

    }
}
