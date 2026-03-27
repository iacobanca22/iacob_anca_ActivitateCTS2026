package Clase;

public class PlataTaxa {
    private Boolean PTaxa;

    public PlataTaxa(Boolean PTaxa) {
        this.PTaxa = PTaxa;
    }

    public boolean taxaPlatita() {
        System.out.println("Se verifica plata taxei");
        return PTaxa;
    }
}
