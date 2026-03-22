package program;
import clase.*;

public class Main {
    public static void main(String[] args){
        GenereazaBon bon=  new BonStandard();
        bon= new AfisareCostLivrare(bon);
        bon= new ScrieMesajClient(bon);
        bon= new AplicaCostReducere(bon);

        bon.genereazaBon();
    }
}
