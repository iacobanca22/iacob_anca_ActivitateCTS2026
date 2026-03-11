package obiect;

public class Masa {

    private boolean masaCuratata;
    private boolean servetele;
    private boolean tacamuri;
    private boolean persoaneInvitate;

    public void setMasaCuratata(boolean masaCuratata) {
        this.masaCuratata = masaCuratata;
    }

    public void setServetele(boolean servetele) {
        this.servetele = servetele;
    }

    public void setTacamuri(boolean tacamuri) {
        this.tacamuri = tacamuri;
    }

    public void setPersoaneInvitate(boolean persoaneInvitate) {
        this.persoaneInvitate = persoaneInvitate;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "curatata=" + masaCuratata +
                ", servetele=" + servetele +
                ", tacamuri=" + tacamuri +
                ", persoaneInvitate=" + persoaneInvitate +
                '}';
    }
}