package clase;

public class ComandaAdauga implements Command{
    private Stoc stoc;
    private Carte carte;

    public ComandaAdauga(Stoc stoc, Carte carte) {
        this.stoc = stoc;
        this.carte = carte;
    }

    @Override
    public void executa() {
        stoc.adaugaCarte(carte);
    }

    @Override
    public void unexecute() {
        stoc.anulareAdaugare(carte);
    }
}
