package clase;

public interface Meniu {
    void adaugaNod(Meniu m)throws Exception;
    void stergeNod(Meniu m) throws Exception;
    void getMeniu(int index) throws Exception;
    void afiseaza();
}
