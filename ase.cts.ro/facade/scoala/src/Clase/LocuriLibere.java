package Clase;

public class LocuriLibere {
    private  boolean locLiber;

    public LocuriLibere(boolean locLiber) {
        this.locLiber = locLiber;
    }
    public boolean areLocuri() {
        System.out.println("Se verifica locuri libere");
        return locLiber;
    }
}
