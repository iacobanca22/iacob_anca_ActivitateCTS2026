package clase;

public class AplicareCeara {
    private String ceara;

    public AplicareCeara(String ceara) {
        this.ceara = ceara;
    }

    public String getCeara() {
        return ceara;
    }
    public void aplicaCeara(){
        System.out.println("Ceara aplicada"+getCeara());
    }
}
