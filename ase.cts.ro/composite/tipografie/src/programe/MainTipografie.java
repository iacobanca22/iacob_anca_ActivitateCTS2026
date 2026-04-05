package programe;
import clase.*;

public class MainTipografie {
    public static void main(String[] args){
        ProduseTipografie flyer= new ProdusSimplu("Flyer");
        ProduseTipografie afis=new ProdusSimplu("Afis");
        ProduseTipografie carte= new ProdusSimplu("Carte de vizita");

        ProduseTipografie pachetMic=new PachetProduse("Pachet Mic");
        ProduseTipografie pachetMare=new PachetProduse("Pachet Mare");
        try {
            pachetMic.adaugaProdus(flyer);
            pachetMic.adaugaProdus(afis);

            pachetMare.adaugaProdus(pachetMic);
            pachetMare.adaugaProdus(carte);


            pachetMic.stergereProdus(afis);
            pachetMare.adaugaProdus(afis);

            pachetMare.afisare();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
