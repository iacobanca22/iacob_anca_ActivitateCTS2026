package clase;

public interface ProduseTipografie {
    void adaugaProdus(ProduseTipografie produs)throws Exception;
    void stergereProdus(ProduseTipografie produs)throws Exception;
    ProduseTipografie getProduseTipografie(int id)throws Exception;
    void afisare();
}
