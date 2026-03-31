package program;
import clase.*;

public class MainBrutarie {
    public static void main(String[] args){
        IProdusDeBaza paine= new PaineSimpla();
    System.out.println(paine.nume()+paine.pret());

    paine =new CuSeminteDecorator(paine);
    System.out.println(paine.nume()+paine.pret());
    paine=new AmbalarePremiuDecorator(paine);
    System.out.println(paine.nume()+paine.pret());




    }
}
