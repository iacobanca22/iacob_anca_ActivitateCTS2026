package clase;

public class Carte {
    private String titlu;
    private float pret;

    public Carte(String titlu, float pret) {
        this.titlu = titlu;
        this.pret = pret;
    }

    public float getPret() {
        return pret;
    }

    public String getTitlu() {
        return titlu;
    }
}
