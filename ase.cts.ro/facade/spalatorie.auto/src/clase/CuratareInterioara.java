package clase;

public class CuratareInterioara {
    private String CuratareInterioare;

    public CuratareInterioara(String curatareInterioare) {
        CuratareInterioare = curatareInterioare;
    }

    public String getCuratareInterioare() {
        return CuratareInterioare;
    }

    public void curataInt(){
        System.out.println("Curatare Interioara curatare"+getCuratareInterioare());
    }

}
