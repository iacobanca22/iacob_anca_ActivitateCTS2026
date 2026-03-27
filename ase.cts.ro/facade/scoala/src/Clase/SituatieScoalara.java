package Clase;

public class SituatieScoalara {
    private float medie;


    public SituatieScoalara(float medie) {
        this.medie = medie;
    }
    public boolean estePromovat() {
        System.out.println("Se verifica media elevului: " + medie);
        return medie >= 5;
    }
}
